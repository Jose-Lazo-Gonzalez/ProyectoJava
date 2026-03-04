package orientacionobjetos.simulaciondia2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Incidencia {

    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaRegistro;
    private LocalDate fechaCierre;
    private Estado estado;
    private Criticidad criticidad;
    private Equipo equipo;

    public Incidencia(int id, String nombre, String descripcion,
                      Criticidad criticidad,
                      Equipo equipo) {

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaRegistro = LocalDate.now();
        this.criticidad = criticidad;
        this.equipo = equipo;
        this.estado = Estado.REGISTRADA;
        this.fechaCierre = null;

        equipo.incrementarIncidencias();
    }

    public void cerrarIncidencia() {
        this.estado = Estado.CERRADA;
        this.fechaCierre = LocalDate.now();
        equipo.decrementarIncidencias();
    }

    protected boolean esUrgente() {

        if (criticidad == Criticidad.CRITICA)
            return true;

        long dias = ChronoUnit.DAYS.between(fechaRegistro, LocalDate.now());

        if (criticidad == Criticidad.GRAVE && dias >= 7)
            return true;

        if (criticidad == Criticidad.MEDIA && dias >= 30)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return nombre + " - " + estado + ": " + criticidad
                + " - " + fechaRegistro
                + " - " + equipo.getNombre();
    }
}



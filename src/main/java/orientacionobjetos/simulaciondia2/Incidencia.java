package orientacionobjetos.simulaciondia2;

public class Incidencia {

    private int id;
    private String nombre;
    private String descripcion;
    private String fechaRegistro;
    private String fechaCierre;
    private Estado estado;
    private Criticidad criticidad;
    private Equipo equipo;

    public Incidencia(int id, String nombre, String descripcion,
                      String fechaRegistro,
                      Criticidad criticidad,
                      Equipo equipo) {

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.criticidad = criticidad;
        this.equipo = equipo;
        this.estado = Estado.REGISTRADA;
        this.fechaCierre = null;

        equipo.incrementarIncidencias();
    }

    public void cerrarIncidencia(String fechaCierre) {
        this.estado = Estado.CERRADA;
        this.fechaCierre = fechaCierre;
        equipo.decrementarIncidencias();
    }

    protected boolean esUrgente() {

        if (criticidad == Criticidad.CRITICA)
            return true;

        int dias = calcularDiasTranscurridos(fechaRegistro, obtenerFechaActual());

        if (criticidad == Criticidad.GRAVE && dias >= 7)
            return true;

        if (criticidad == Criticidad.MEDIA && dias >= 30)
            return true;

        return false;
    }

    private int calcularDiasTranscurridos(String fechaInicio, String fechaFin) {
        return convertirADias(fechaFin) - convertirADias(fechaInicio);
    }

    private int convertirADias(String fecha) {

        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        return anio * 365 + mes * 30 + dia;
    }

    private String obtenerFechaActual() {
        return "17/02/2026";
    }

    @Override
    public String toString() {
        return nombre + " - " + estado + ": " + criticidad
                + " - " + fechaRegistro
                + " - " + equipo.getNombre();
    }
}


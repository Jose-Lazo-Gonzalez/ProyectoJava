package orientacionobjetos.simulaciondia2;

import java.util.Objects;

public class Equipo {

    private String nombre;
    private String direccionMac;
    private String sistemaOperativo;
    private int numIncidenciasPendientes;
    private Usuario usuario;

    public Equipo(String nombre, String direccionMac, String sistemaOperativo, Usuario usuario) {
        this.nombre = nombre;
        this.direccionMac = direccionMac;
        this.sistemaOperativo = sistemaOperativo;
        this.usuario = usuario;
        this.numIncidenciasPendientes = 0;
    }

    public String getNombre() { return nombre; }
    public String getDireccionMac() { return direccionMac; }
    public String getSistemaOperativo() { return sistemaOperativo; }
    public int getNumIncidenciasPendientes() { return numIncidenciasPendientes; }
    public Usuario getUsuario() { return usuario; }

    public void incrementarIncidencias() {
        numIncidenciasPendientes++;
    }

    public void decrementarIncidencias() {
        if (numIncidenciasPendientes > 0) numIncidenciasPendientes--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipo)) return false;
        Equipo equipo = (Equipo) o;
        return direccionMac.equals(equipo.direccionMac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccionMac);
    }

    @Override
    public String toString() {
        return nombre + " - " + direccionMac + " : "
                + numIncidenciasPendientes + " - Usuario: "
                + usuario.getNombre();
    }
}


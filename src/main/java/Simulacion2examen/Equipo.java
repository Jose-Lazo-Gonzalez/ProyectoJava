package Simulacion2examen;

public class Equipo {
    private String nombre;
    private String direccionMAC;
    private String sistemOperativo;
    private int pendientesResolucion;

    public Equipo(String nombre, String direccionMAC, String sistemaOperativo0) {
        this.nombre = nombre;
        this.direccionMAC = direccionMAC;
        this.sistemOperativo = sistemOperativo;
        this.pendientesResolucion = 0;
    }
}

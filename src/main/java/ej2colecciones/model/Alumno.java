package ej2colecciones.model;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String DNi;

    public Alumno(String nombre, String DNi) {
        this.nombre = nombre;
        this.DNi = DNi;
    }

    public String getDNi() {
        return DNi;
    }

    public void setDNi(String DNi) {
        this.DNi = DNi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + getNombre() + '\'' +
                ", DNi='" + getDNi() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(DNi, alumno.DNi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, DNi);
    }
}

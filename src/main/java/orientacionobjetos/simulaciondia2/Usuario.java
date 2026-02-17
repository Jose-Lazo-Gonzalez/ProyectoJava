package orientacionobjetos.simulaciondia2;

import java.util.Objects;

public class Usuario {

    private String dni;
    private String nombre;
    private String departamento;

    public Usuario(String dni, String nombre, String departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return dni.equals(usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ") - " + departamento;
    }
}


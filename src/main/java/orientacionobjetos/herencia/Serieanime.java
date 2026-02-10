package orientacionobjetos.herencia;

import java.util.Objects;

public class Serieanime {
    private String nombre;
    private int numTemporada;
    private int numCapitulos;
    private String autor;

    public Serieanime(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(Serieanime serie) {
        this.nombre = nombre;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public int getNumCapitulos() {
        return numCapitulos;
    }

    public void setNumCapitulos(int numCapitulos) {
        this.numCapitulos = numCapitulos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Serieanime{" +
                "nombre='" + nombre + '\'' +
                ", numTemporada=" + numTemporada +
                ", numCapitulos=" + numCapitulos +
                ", autor='" + autor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serieanime that = (Serieanime) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor);
    }
}

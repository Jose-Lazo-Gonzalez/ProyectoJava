package orientacionobjetos.herencia;

import orientacionobjetos.Persona;

import java.util.Objects;

public class Personajeanime {
    private String nombre;
    private Serieanime serie;
    private int edad;
    private Transformacion transformacion;

    public Personajeanime(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serieanime getSerie() {
        return serie;
    }

    public void setSerie(Serieanime serie) {
        this.serie = serie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Transformacion getTransformacion() {
        return transformacion;
    }

    public void setTransformacion(Transformacion transformacion) {
        this.transformacion = transformacion;
    }

    @Override
    public String toString() {
        return "Personajeanime{" +
                "nombre='" + nombre + '\'' +
                ", serie=" + serie +
                ", edad=" + edad +
                ", transformacion=" + transformacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personajeanime that = (Personajeanime) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(serie, that.serie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, serie);
    }

    public void comer(){
        System.out.println("esta comiendo");
    }
    public void atacar (){
        System.out.println("Esta atacando");
    }
    public boolean transformarse (Personajeanime origen, Personajeanime destino){
        boolean transformado= true;
        this.transformacion=new Transformacion(origen, destino);
        return transformado;
    }
}

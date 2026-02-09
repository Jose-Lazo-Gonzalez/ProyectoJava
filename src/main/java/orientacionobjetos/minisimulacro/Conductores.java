package orientacionobjetos.minisimulacro;

public class Conductores {

    //atributos
    String nombre;
    int experiencia;

    //constructores


    public Conductores(String nombre, int experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //metodos
    public void conducir(){
        System.out.println(nombre+"conduciendo");
    }
}

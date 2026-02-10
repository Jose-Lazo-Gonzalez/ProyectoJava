package orientacionobjetos.herencia;

public class Luffy extends Personajeanime{

    private String fruta;
    private boolean estaAgua;



    public Luffy(String nombre) {
        super(nombre);
    }



    void reir(){
        System.out.println("se rie");
    }

    @Override
    public String toString() {
        return "Luffy{" +
                "fruta='" + fruta + '\'' +
                ", estaAgua=" + estaAgua +
                ", nombre='" + getNombre() + '\'' +
                ", serie=" + getSerie() +
                ", edad=" + getEdad() +
                ", transformacion=" + getTransformacion() +
                '}';
    }

}


package orientacionobjetos.herencia;

public class Naruto  extends Personajeanime{
    private Elemento elemento;
    private Aldea aldea;

    public Naruto(String nombre) {
        super(nombre);
    }
    public void entrenar(){
        System.out.println("Estan entrenando");

    }
    public void clones(){
        System.out.println("se esta clonando");

    }
}

package orientacionobjetos.herencia;

public class Goku extends Personajeanime{

    private boolean estaVivo;


    public Goku(String nombre) {
        super(nombre);
    }

    public void volar(){
        System.out.println("Esta volando");
    }
    public void energiavital(){
        System.out.println("Esta cogiendo energia vital");
    }
    public void teletransportar(){
        System.out.println("se esta teletransportando");
    }
}

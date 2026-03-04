package orientacionobjetos.cadenaAlimenticia;

public class Rapaz extends Animal{
    public Rapaz(String nombre, String habitat, String[] come, String[] escomido) {
        super(nombre, habitat, come, escomido);
    }


    @Override
    public void ataca() {
        System.out.println("ataca");
    }

    @Override
    public void huye() {

    }
}

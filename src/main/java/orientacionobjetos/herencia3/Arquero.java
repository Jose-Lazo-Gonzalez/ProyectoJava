package orientacionobjetos.herencia3;

public class Arquero extends Personaje {

    public Arquero(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public String getArma() {
        return "Flecha";
    }



    public boolean esAtacadoPor(Guerrero g) {
        return false;
    }

    public boolean esAtacadoPor(Mago m) {
        return true;
    }



    public boolean esAtacadoPor(Guerrero g, int distancia) {
        return distancia < 50;
    }

    public boolean esAtacadoPor(Mago m, int distancia) {
        return true;
    }
}






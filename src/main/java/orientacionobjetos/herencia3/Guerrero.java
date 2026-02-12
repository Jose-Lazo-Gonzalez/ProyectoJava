package orientacionobjetos.herencia3;
public class Guerrero extends Personaje {

    public Guerrero(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public String getArma() {
        return "Espada";
    }



    public boolean esAtacadoPor(Arquero a) {
        return true;
    }

    public boolean esAtacadoPor(Mago m) {
        return true;
    }



    public boolean esAtacadoPor(Arquero a, int distancia) {
        return distancia > 100;
    }

    public boolean esAtacadoPor(Mago m, int distancia) {
        return true;
    }
}


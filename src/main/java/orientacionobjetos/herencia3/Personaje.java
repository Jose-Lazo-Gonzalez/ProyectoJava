package orientacionobjetos.herencia3;

public class Personaje {

    protected String nombre;
    protected int nivel;
    protected int hp;

    public Personaje(String nombre, int nivel, int hp) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
    }

    public String getArma() {
        return "";
    }



    public boolean esAtacado(Personaje atacante) {
        return atacante.esAtacadoPor(this);
    }

    public boolean esAtacado(Personaje atacante, int distancia) {
        return atacante.esAtacadoPor(this, distancia);
    }



    public boolean esAtacadoPor(Personaje p) {
        return false;
    }

    public boolean esAtacadoPor(Personaje p, int distancia) {
        return false;
    }
}





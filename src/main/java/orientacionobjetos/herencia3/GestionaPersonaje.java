package orientacionobjetos.herencia3;

public class GestionaPersonaje {

    public static void main(String[] args) {

        Personaje villano = new Villano("Javier", 10, 200);
        Personaje guerrero = new Guerrero("Sergio", 8, 150);
        Personaje arquero = new Arquero("Paquirrin", 7, 120);
        Personaje mago = new Mago("Elena", 9, 100);

        System.out.println(" ARMAS");
        System.out.println("Villano: " + villano.getArma());
        System.out.println("Guerrero: " + guerrero.getArma());
        System.out.println("Arquero: " + arquero.getArma());
        System.out.println("Mago: " + mago.getArma());

        System.out.println("SIN DISTANCIA");
        System.out.println("¿Arquero ataca a Guerrero? "
                + guerrero.esAtacado(arquero));

        System.out.println("¿Guerrero ataca a Arquero? "
                + arquero.esAtacado(guerrero));

        System.out.println("CON DISTANCIA");
        System.out.println("¿Arquero ataca a Guerrero a 150m? "
                + guerrero.esAtacado(arquero, 150));

        System.out.println("¿Guerrero ataca a Arquero a 30m? "
                + arquero.esAtacado(guerrero, 30));
    }
}


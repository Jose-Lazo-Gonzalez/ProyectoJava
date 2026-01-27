import java.util.Random;
import java.util.Scanner;

public class dungeon {
    static void main(String[] args) {
        System.out.println("existo");
        Scanner sc = new Scanner(System.in);
        dungeon referencia = new dungeon();
        String heroe;
        System.out.println("Dime el nombre del heroe");
        heroe = sc.next();
        int heroeHP=100;
        int heroeMP=20;
        int mounstroHP=80;
        do {
            int damage;
            int opcion=0;
            System.out.println("1.Ataque basico");
            System.out.println("2.Ataque especial");
            System.out.println("3.Curar");
            opcion= sc.nextInt();
            switch (opcion){
                case 1:
                    damage= referencia.generardamage(7,12);
                    mounstroHP-=damage;
                    System.out.println(heroe+" ha golpeado al mounstro con un ataque normal y le ha quitado "+damage+" de vida");
                    break;
                case 2:
                    if(referencia.gestionamana(heroeMP))
                    {
                        damage = referencia.generardamage(15, 25);
                        mounstroHP-=damage;
                        heroeMP-=5;
                        System.out.println(heroe+"ha golpeado al mounstro con un ataque especial y le ha quitado "+damage+" de vida");

                    }break;

                case 3:
                    if(referencia.gestionamana(heroeMP)){
                        heroeHP+=20;
                        heroeMP-=8;
                        System.out.println("El heroe se ha curado un total de 8 de vida");
                    }

                    break;

            }
            if (mounstroHP > 0) {
                damage= referencia.generardamage(5,15);
                heroeHP-=damage;
                System.out.println("El mounstro ha golpeado a "+ heroe+ " y le ha hecho " + damage+ " de damage");
            }
            referencia.mostrarestado(heroe,heroeHP,heroeMP,mounstroHP);

        }while (heroeHP>0 && mounstroHP>0);




    }
    int generardamage (int minimo,int maximo){
        Random random = new Random();
        int damage = random.nextInt(maximo - minimo + 1) + minimo;
        return damage;
    }
    void mostrarestado(String nombre, int vida, int mana, int vidamalo ){

        String barravida="";
        System.out.println(" Vida de "+ nombre);
        for(int i=0; i < vida; i++){
            barravida= barravida + "*";
        }
        System.out.println(barravida);
        String barramana ="";
        for(int i=0; i < mana; i++){
            barramana = barramana + "*";
        }System.out.println(" Mana de "+ nombre);

        System.out.println(barramana);
        String barramalo ="";
        for(int i=0; i < vidamalo; i++){
            barramalo = barramalo + "*";
        }
        System.out.println(" Vide el mounstro");
        System.out.println(barramalo);
    }
    boolean gestionamana(int mana){
        if (mana<5){
            return false;
        }
        else {
            return true;
        }
    }
}

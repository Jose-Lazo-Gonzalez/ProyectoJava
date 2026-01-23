import java.util.Random;
import java.util.Scanner;

public class Craps {
    static void main(String[] args) {
        Craps ref=new Craps();
        Scanner sc = new Scanner(System.in);
        Random aleatorio= new Random();
        int contador=0;
        int []dados1=new int [20];
        int []dados2=new int[20];
        int[] ganper=new int[20];
        int[] gananciaP1 = new int[20];

        System.out.println("Empieza el juego");
        System.out.println("Dale a 1 para jugar y 2 para salir");
        int opcion= sc.nextInt();
        while (opcion==1){
            dados1[contador]=aleatorio.nextInt(6)+1;
            dados2[contador]=aleatorio.nextInt(6)+1;


            ref.apostar(dados1[contador], dados2[contador], gananciaP1, ganper, contador);

            contador++;
            System.out.println("Dale a 1 para jugar y 2 para salir");
             opcion= sc.nextInt();


        }
        ref.historial(dados1,dados2,gananciaP1,ganper,contador);

    }
    void apostar(int dados1, int dados2, int[] gananciaP1, int[] ganper, int pos) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que cantidad quieres apostar:");
        int apuesta = sc.nextInt();

        System.out.println("Dime la cantidad de doblones que va usted a apostar");
        int cantidad = sc.nextInt();

        int resultado = dados1 + dados2;
        System.out.println("Los dados sacaron: " + resultado);

        if (resultado == apuesta) {
            gananciaP1[pos] = cantidad * 2;
            ganper[pos] = 1;
            System.out.println("Ha ganado");
        } else {
            gananciaP1[pos] = cantidad;
            ganper[pos] = 2;
            System.out.println("Has perdido");
        }
    }

    void historial(int[]dados1P2, int[]dado2P2, int[]gananciasP2,int[] ganperP2,int contadorP2){
        System.out.println("Tu historial es:");

        for (int i =0; i<contadorP2;i++){
            if(ganperP2[i]==1){
            System.out.println("Tus dados han sumado "+dados1P2[i]+" y "+dado2P2[i]+" Entonces usted ha ganado un total de "+gananciasP2[i]+" doblones de oro marinero");
            }
            else if (ganperP2[i]==2) {
                System.out.println("Tus dados han sumado "+dados1P2[i]+" y "+dado2P2[i]+" Entonces usted ha perdido un total de "+gananciasP2[i]+" doblones de oro marinero");
            }
        }
    }

}

import java.util.Random;
import java.util.Scanner;

public class examenScapeRoom {
    static void main(String[] args) {
        examenScapeRoom ref= new examenScapeRoom();
        Scanner sc = new Scanner(System.in);
        String opcion;
        int[]codigos=new int[5];
        String[]estados=new String[5];
        Random generador=new Random();
        do {
             opcion=ref.menu(sc);
            switch (opcion){
                case "G":
                    System.out.println("Generando mapa...");
                    ref.generarSala(codigos,estados,generador);
                    break;

                case "A":
                    System.out.println("Accediendo a sala...");
                    ref.abrirSala(codigos,estados,sc);
                    break;
                case "E":
                    System.out.println("Escaneando estado del Scape Room...");
                    ref.verEstados(estados);
                    break;
            }
        }while(!opcion.equals("S"));

    }
    String menu(Scanner sc){
        String opcion;

            System.out.println("G)Generar partida");
            System.out.println("A)Intentar abrir una sala");
            System.out.println("E)Estado del scape room");
            System.out.println("S) Salir");
            opcion = sc.next();
            opcion=opcion.toUpperCase();
            return opcion;



    }
    void generarSala(int[]codigos, String[]estados,Random generador){
        for(int i=0;i<5;i++){
            codigos[i]=generador.nextInt(6);
            estados[i]="BLOQUEADA";
        }

    }
    void verEstados (String[] estados){
        int numbloq=0;
        int numdesbloq=0;
        int numinvalid=0;
        for(int a=0; a<5;a++){
            if (estados[a]=="BLOQUEADA"){
                numbloq++;
            }
            else if (estados[a]=="DESBLOQUEADA") {
                numdesbloq++;
            }
            else if (estados[a]=="INVALIDADA")
            {
                numinvalid++;
            }

        }
        System.out.println("Numeros de salas bloqueadas: "+numbloq);
        System.out.println("Numeros de salas desbloqueadas: "+numdesbloq);
        System.out.println("Numeros de salas invalidadas: "+numinvalid);
        for(int c = 0; c <5; c++){
            System.out.println("Sala "+c+estados[c]);
        }
    }
    void abrirSala(int[]codigos, String[]estados,Scanner sc){
        int salaOpcion;
        int codigointento;

        do {
            System.out.println("Dime el numero de sala para abrir");
            salaOpcion= sc.nextInt();
        }while (salaOpcion>4 || salaOpcion<0);

        if (estados[salaOpcion]=="DESBLOQUEADA"){
            System.out.println("La saña "+salaOpcion+" ya ha sido desbloqueada");
        }
        else if (estados[salaOpcion]=="INVALIDADA") {
            System.out.println("La sala "+ salaOpcion+" ya ha sido invalidada y no puede completar el juego");
        }
        else if (estados[salaOpcion]=="BLOQUEADA") {
            int contadorFallos=0;
            System.out.println("La sal aesta bloqueada, introduzca su codigo de apertura: ");
            do {
                codigointento= sc.nextInt();
                if (codigointento==codigos[salaOpcion]){
                    System.out.println("Codigo correcto, sala "+salaOpcion+"desbloqueada");
                    estados[salaOpcion]="DESBLOQUEADA";
                }
                else {
                    System.out.println("Ha fallado, intentelo de nuevo con un numero del 0 al 6");

                    contadorFallos++;
                    if (contadorFallos==3){
                        System.out.println("Ha perdido sus 3 intentos, su sala ha quedado invalidada");
                        estados[salaOpcion]="INVALIDADA";
                    }
                }
            }while(codigointento!=codigos[salaOpcion] && estados[salaOpcion]!="INVALIDADA");

        }


    }
}

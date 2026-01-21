import java.util.Random;
import java.util.Scanner;

public class matrices3 {public static void main(String[] args) {
    matrices3 ref=new matrices3();
    int[][] matriz = new int[5][5];
    Random random = new Random();


    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            matriz[i][j] = random.nextInt(100) + 1;
        }
    }


    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.printf("%4d", matriz[i][j]);
        }
        System.out.println();
    }
    int opcion=0;
    do { opcion= ref.menu();
        switch (opcion){
            case 1:
                ref.identificaramenazas(matriz);
                break;
            case 2:
                ref.calculoescudo(matriz);
                break;
            case 3:
                ref.refugio(matriz);
                break;

        }

    }while (opcion!=4);

}
int menu(){
    Scanner sc=new Scanner(System.in);
    System.out.println("1.Identificar Amenazas");
    System.out.println("2.Calcular el Escudo:");
    System.out.println("3.Encontrar el Refugio:");
    System.out.println("4.Salir");
    System.out.println("Elige una de las anteriores opciones:");
    int opcion= sc.nextInt();
    return opcion;
}
void identificaramenazas(int[][]matrizP1){
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (matrizP1[i][j] >80){
                System.out.println("Zona de peligro coordenadas"+i+j);
        }
    }
}
}
void calculoescudo(int[][]matrizP2){
    int contador=0;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            contador+=matrizP2[i][j];
        }
}
    if (contador>1000){
        System.out.println("Los escudos deben estar llenos, nivel del mapa general"+contador);
    }
}
void refugio(int[][]matrizP3){
    int menor=101;
    int filamenor=0;
    int columnamenor=0;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if(matrizP3[i][j]<menor){
                menor=matrizP3[i][j];
                filamenor=matrizP3[i][j];
                columnamenor=matrizP3[i][j];
            }

        }
    }
    System.out.println("El valor mas tranquilo de la galaxia es"+menor+ "y se encuentra en las coordenadas x:"+filamenor+"y:"+columnamenor);
}
}


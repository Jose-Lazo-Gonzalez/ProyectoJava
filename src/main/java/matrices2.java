import java.util.Scanner;

public class matrices2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[][] sala = new boolean[3][4];

        matrices2 ref = new matrices2();
        int contador = ref.registraEspectadores(sala);

        System.out.println("Total de espectadores registrados: " + contador);
        System.out.println("Estado de la sala:");

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
        int contadorfilas;
        int contadortotal = 0;
        System.out.println("Dime la fila para recontar:");
        int fila = sc.nextInt();
        contadorfilas = ref.calculaTotalPersonasPorFIlas(sala, fila);
        System.out.println("Usted ha encontrado un total de" + contadorfilas + "asientos ocupados en esa fila");
        System.out.println("Validamos el numero de asientos:");
        contadortotal += ref.calculaTotalPersonasPorFIlas(sala, 0);
        contadortotal += ref.calculaTotalPersonasPorFIlas(sala, 1);
        contadortotal += ref.calculaTotalPersonasPorFIlas(sala, 2);
        ref.validaraforo(sala, contadortotal, contador);
    }

    int registraEspectadores(boolean[][] sala) {

        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int asiento;
        int contador = 0;

        System.out.println("Dime el numero de la fila (-1 para salir):");
        fila = sc.nextInt();

        while (fila != -1) {

            System.out.println("Dime el numero del asiento:");
            asiento = sc.nextInt();

            if (fila < 0 || fila >= sala.length || asiento < 0 || asiento >= sala[0].length) {
                System.out.println("Posición fuera de rango.");
            } else if (sala[fila][asiento]) {
                System.out.println("Ese asiento ya está ocupado.");
            } else {
                sala[fila][asiento] = true;
                contador++;
            }

            System.out.println("Dime el numero de la fila (-1 para salir):");
            fila = sc.nextInt();
        }

        return contador;
    }

    int calculaTotalPersonasPorFIlas(boolean[][] salaP1, int filaP1) {
        int contadorfilas = 0;
        boolean[] filamatriz = salaP1[filaP1];
        for (int i = 0; i < filamatriz.length; i++) {
            if (filamatriz[i]) {
                contadorfilas++;
            }

        }

        return contadorfilas;

    }

    void validaraforo(boolean[][] salaP2, int contadormetodo2, int contadormetodo1) {

        if (contadormetodo1 == contadormetodo2) {
            System.out.println("Esta correcto el conteo");
        } else {
            System.out.println("Esta mal el conteo");
        }


    }

}



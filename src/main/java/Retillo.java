import java.util.Arrays;
import java.util.Scanner;

public class Retillo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Cuantos datos quieres registrar");
        a = sc.nextInt();

        String[] recurso = new String[a];
        int[] cantidad = new int[a];
        int[] nivel = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Introduce el tipo de recurso");
            recurso[i] = sc.next();

            System.out.println("Introduce la cantidad de ese mismo recurso");
            cantidad[i] = sc.nextInt();

            System.out.println("Introduce el nivel critico de ese recurso");
            nivel[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(recurso));
        System.out.println(Arrays.toString(cantidad));
        System.out.println(Arrays.toString(nivel));


        String cadenon = extraer_datos(recurso, cantidad, nivel);
        comprobacion(recurso, cantidad, nivel, cadenon);
    }

    public static String extraer_datos(String[] recursos, int[] cantidades, int[] niveles) {
        Scanner sc = new Scanner(System.in);

        String recursogastado;


        System.out.println("Elemento gastado:");
        recursogastado = sc.next();


        int indice = -1;
        int i = 0;

        while (i < recursos.length && indice == -1) {
            if (recursos[i].equals(recursogastado)) {
                indice = i;
            }
            i++;
        }
        String cadenote;

        if (indice != -1) {
            System.out.println("Recurso encontrado ");

            cadenote = recursos[indice] + "," + cantidades[indice] + "," + niveles[indice];
        } else {
            System.out.println("Recurso no encontrado");
            cadenote = "-1";
        }
        return cadenote;

    }

    public static void comprobacion(String[] recursos, int[] cantidades, int[] niveles, String resultado) {

        if (resultado.equals("-1")) {
            System.out.println("No se puede comprobar porque el recurso no existe.");
            return;
        }

        String[] parte = resultado.split(",");

        int i = 0;
        int indice = -1;

        while (i < recursos.length && indice == -1) {
            if (recursos[i].equals(parte[0])) {
                indice = i;
            }
            i++;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto de ese recurso has gastado?");
        int cantidadGastada = sc.nextInt();

        int cantidad = Integer.parseInt(parte[1]);
        int nivelCritico = Integer.parseInt(parte[2]);

        int cantidadTotal = cantidad - cantidadGastada;

        if (cantidadTotal < nivelCritico) {
            System.out.println("Nivel crítico");
        } else {
            System.out.println("To bien manin");
        }
    }


}
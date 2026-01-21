import java.util.Scanner;

public class ejercicio9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String operacion;

        do {
            System.out.println("========================================");
            System.out.println(" Introduzca suma si desea sumar");
            System.out.println("Introduzca resta si desea restar");
            System.out.println("Introduzca multiplicacion si desea multiplicar");
            System.out.println("Introduzca division si desea dividir");
            System.out.println("Introduzca @ para salir del menú.");
            System.out.println("=======================================");
            System.out.println("Elige que tipo de operacion vas a realizar");

            operacion = sc.next();

            switch (operacion) {
                case "suma":
                    System.out.println("Introduce los numeros a sumar");
                    int numero1 = sc.nextInt();
                    int numero2 = sc.nextInt();
                    System.out.println(numero1 + numero2);
                    break;

                case "resta":
                    System.out.println("Introduce los numeros a restar");
                    int numero3 = sc.nextInt();
                    int numero4 = sc.nextInt();
                    System.out.println(numero3 - numero4);
                    break;

                case "multiplicacion":
                    System.out.println("Introduce los numeros a multiplicar");
                    int numero5 = sc.nextInt();
                    int numero6 = sc.nextInt();
                    System.out.println(numero5 * numero6);
                    break;

                case "division":
                    System.out.println("Introduce los numeros a dividir");
                    int numero7 = sc.nextInt();
                    int numero8 = sc.nextInt();
                    System.out.println(numero7 / numero8);
                    break;
            }

        } while (!operacion.equals("@"));
    }
}


import java.util.Scanner;

public class ejercicio8 {
    static void main() {
        System.out.println("Elige que tipo de operacion vas a realizar");
        Scanner sc = new Scanner(System.in);
        String operacion;
        operacion = sc.next();
        switch (operacion) {
            case "suma":
                System.out.println("Introduce los numeros a sumar");
                int numero1;
                int numero2;
                numero1 = sc.nextInt();
                numero2 = sc.nextInt();
                System.out.println(numero1 + numero2);
                break;
            case "resta":
                System.out.println("Introduce los numeros a restar");
                int numero3;
                int numero4;
                numero3 = sc.nextInt();
                numero4 = sc.nextInt();
                System.out.println(numero3 - numero4);
                break;
            case "multiplicacion":
                System.out.println("Introduce los numeros a multiplicacion");
                int numero5;
                int numero6;
                numero5 = sc.nextInt();
                numero6 = sc.nextInt();
                System.out.println(numero5 * numero6);
                break;
            case "division":
                System.out.println("Introduce los numeros a dividir");
                int numero7;
                int numero8;
                numero7 = sc.nextInt();
                numero8 = sc.nextInt();
                System.out.println(numero7 / numero8);
                break;


        }
    }
}

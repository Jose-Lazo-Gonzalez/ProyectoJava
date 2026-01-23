import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        String cadena = "";
        int numero;
        int contador;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero del cuadrado");
        numero = sc.nextInt();
        for (int i = 0; i < numero + 1; i++) {
            cadena += "*";
            System.out.println(cadena);
        }
    }
}

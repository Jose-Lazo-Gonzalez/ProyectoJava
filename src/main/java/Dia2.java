import java.util.Scanner;

public class Dia2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero == 0) {
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}

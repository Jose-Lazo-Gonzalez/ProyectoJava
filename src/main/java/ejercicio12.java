import java.util.Scanner;

public class ejercicio12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String contraseña;
        do {
            System.out.println("Dime la contraseña");

            contraseña = sc.next();

        } while ((!contraseña.equals("1234")));
        System.out.println("Bienvenido");
    }
}

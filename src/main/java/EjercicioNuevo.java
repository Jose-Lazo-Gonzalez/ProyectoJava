import java.util.Scanner;

public class EjercicioNuevo {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int numero1;
        numero1= sc.nextInt();
        switch (numero1){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            default:
                System.out.println(("EL numero es otro"));
                break;
        }
    }
}

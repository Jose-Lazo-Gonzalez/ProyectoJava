import java.util.Scanner;

public class ejercicio11 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        numero1= sc.nextInt();
        numero2= sc.nextInt();
        numero3= sc.nextInt();
        if ((numero1>numero2)&&(numero1>numero3)){
            System.out.println("El mayor es el primer numero");
        }
        else if (((numero2>numero1)&&(numero2>numero3))) {
            System.out.println("El mayor es el segundo numero");
        }
        else {
            System.out.println("El mayor es el tercer numero");
        }
    }


}
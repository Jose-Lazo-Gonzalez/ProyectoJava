import java.util.Scanner;

public class ejercicio6 {
    static void main() {
        System.out.println("1.Azul");
        System.out.println("2.Roja");
        System.out.println("3.Verde");
        System.out.println("4.Rosa");
        System.out.println("5.Gris");
        System.out.println("Introduce el numero de tu habitacion preferida");
        Scanner sc =new Scanner(System.in);
        int numero1;
        numero1= sc.nextInt();
        switch (numero1){
            case 1:
                System.out.println("Tiene dos camas en la primera planta");
                break;
            case 2:
                System.out.println("Tiene una cama en la primera planta");
                break;
            case 3:
                System.out.println("Tiene tres camas en la segunda planta");
                break;
            case 4:
                System.out.println("Tiene dos camas en la segunda planta");
                break;
            case 5:
                System.out.println("Tiene una cama en la tercera planta");
                break;

        }
    }
}

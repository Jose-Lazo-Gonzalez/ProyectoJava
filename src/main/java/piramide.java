import java.util.Scanner;

public class piramide {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {


            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1) {

                    System.out.print("*");
                } else {

                    if (j == 1 || j == (2 * i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}

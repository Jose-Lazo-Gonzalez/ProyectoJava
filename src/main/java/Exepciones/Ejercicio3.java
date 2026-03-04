package Exepciones;

import java.util.Scanner;

public class Ejercicio3 {
    public void numerinos(){
        for (int i = 0; i <20; i++){
        Scanner sc = new Scanner(System.in);
        int numero=sc.nextInt();
        if (numero >0){
            try {
                throw new ArithmeticException("El numero es positivo");
            } catch (ArithmeticException e) {
                System.out.println("Ha ocurrido una excepcion" + e.getMessage());
            }finally {
                System.out.println("se ejecuta el finally");
            }
        }
    }
}}

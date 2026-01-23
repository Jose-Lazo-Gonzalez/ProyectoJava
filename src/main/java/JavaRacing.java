import java.util.Scanner;

public class JavaRacing {
    static void main() {
        Scanner sc = new Scanner(System.in);
        JavaRacing referencia = new JavaRacing();
        int pintomenu;
        int pintoescuderia = 0;
        String[] nombres = new String[100];
        double[] tiempos = new double[100];

        do {
            pintomenu = referencia.ejecutarmenu();
            switch (pintomenu) {
                case 1:
                    System.out.println("opcion1");
                    pintoescuderia = referencia.inicializaEscuderia(nombres, tiempos);
                    break;


                case 2:
                    System.out.println("opcion2");
                    referencia.formatearpilotos(nombres);
                    break;

                case 3:
                    System.out.println("opcion3");
                    referencia.verestadistica(tiempos, nombres, pintoescuderia);
                    break;


                case 4:
                    System.out.println("opcion4");
                    break;


                case 5:
                    System.out.println("opcion5");
                    break;

                case 6:
                    System.out.println("saliendo");
                    break;


            }

        } while (pintomenu != 6);
    }

    int ejecutarmenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Cargar/Reiniciar Datos: Llama al Apartado 2.");
        System.out.println("2. Formatear Nombres: Ejecuta el proceso de limpieza y mayúsculas ");
        System.out.println("3. Ver Estadísticas: Muestra la media y el ganador ");
        System.out.println("4. Buscar Piloto: Pide un nombre y devuelve su tiempo");
        System.out.println("5.Generar IDs de Carrera: Muestra los códigos de tres letras");
        System.out.println("6.Salir...");
        System.out.println("Elige una opcion:");
        int opcion = sc.nextInt();
        return opcion;
    }

    int inicializaEscuderia(String[] nombresP, double[] tiemposP) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos pilotos deseas registrar");
        int numPilotos = sc.nextInt();
        for (int i = 0; i < numPilotos; i++) {
            System.out.println("Dime el nombre del piloto");
            String nombre = sc.next();
            nombresP[i] = nombre;
            System.out.println("Dime el tiempo del piloto");
            double tiempo = sc.nextDouble();
            tiemposP[i] = tiempo;
        }


        return numPilotos;
    }

    void formatearpilotos(String[] nombresP2) {
        for (int i = 0; i < nombresP2.length; i++) {
            if (nombresP2[i] != null) {


                String nombre = nombresP2[i].trim();


                nombre = nombre.toUpperCase();


                if (nombre.length() > 10) {
                    nombre = nombre.substring(0, 10) + ".";
                }


                nombresP2[i] = nombre;


            }
        }
        System.out.println("=== LISTA DE PILOTOS FORMATEADOS ===");
        for (int x = 0; x < nombresP2.length; x++) {
            if (nombresP2[x] != null) {
                System.out.println((x + 1) + ". " + nombresP2[x]);
            }
        }
    }

    void verestadistica(double[] tiemposP3, String[] nombresP3, int pintoescuderia) {
        double sumando = 0;
        for (int x = 0; x < tiemposP3.length; x++) {
            double numero = tiemposP3[x];
            sumando += numero;
        }
        double media = 0;
        media = (sumando / pintoescuderia);
        System.out.println("La media es:");
        System.out.println(media);
        double mejort = tiemposP3[0];
        String mejorp = nombresP3[0];
        for (int x = 0; x < tiemposP3.length; x++) {
            if (mejort > tiemposP3[x]) {
                mejort = tiemposP3[x];
                mejorp = nombresP3[x];
            }
        }
        System.out.println("El mejor tiempo es:");
        System.out.println(mejort);
        System.out.println("Y el ganador es:");
        System.out.println(mejorp);
    }


}


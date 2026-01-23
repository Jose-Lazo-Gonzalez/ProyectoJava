import java.util.Scanner;

public class pokemones {
    static void main(String[] args) {


        String[] nombrePokemon = new String[15];
        int[] nivelPokemon = new int[100];
        int contadorfor = 0;
        int contador = 0;
        pokemones referencia = new pokemones();
        int pintomenu;
        pintomenu = referencia.menu();
        int a;
        a = 1;
        int capturaactiva;
        contador = referencia.captura(nombrePokemon, nivelPokemon, contador);

        do {
            pintomenu = referencia.menu();


            if (pintomenu == 1) {
                System.out.println("Opción 1: Capturar Pokémon ");
                contador = referencia.captura(nombrePokemon, nivelPokemon, contador);


            } else if (pintomenu == 2) {
                System.out.println("Opción 2: Realizar batalla ");
            } else if (pintomenu == 3) {
                System.out.println("Opción 3:  Pokémon ");
                for (int x = 0; x < nombrePokemon.length; x++) {
                    System.out.println(nombrePokemon[contadorfor]);
                    System.out.println(nivelPokemon[contadorfor]);
                    contadorfor++;
                }
                ;
            } else if (pintomenu == 4) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción inválida.");
            }

        } while (pintomenu != 4);
    }

    int menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("1. Permite al entrenador capturar un pokemon");
        System.out.println("2. Realizar batalla");
        System.out.println("3. Lista los pokemons del entrenador en formato simple");
        System.out.println("4. Finalizar");
        System.out.print("Elige una opción: ");

        opcion = sc.nextInt();

        return opcion;
    }


    int captura(String[] nombrePokemon, int[] nivelPokemon, int contador) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el nombre del pokemon:");
        nombrePokemon[contador] = sc.next();

        System.out.println("Introduce el nivel del pokemon:");
        nivelPokemon[contador] = sc.nextInt();

        contador++;
        return contador;
    }

}
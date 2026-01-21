public class Matrices1 {
    static void main() {
        int[][] inventario = {
                {5, 0, 8},  // Estante 0 (Arriba)
                {2, 10, 0}, // Estante 1 (Medio)
                {0, 4, 1}   // Estante 2 (Abajo)
        };
        Matrices1 referencia=new Matrices1();


        referencia.recorrido(inventario);
        referencia.contabilizaAgotados(inventario);
    }
void recorrido(int[][]inventarioP1) {
    for (int y = 0; y < inventarioP1.length; y++) {
        int[] fila = inventarioP1[y];
        for (int j = 0; j < fila.length; j++) {
            if (fila[j] == 0) {
                System.out.println("¡Alerta! Producto agotado en la Fila" + y + ", Columna" + j);
            }
        }
    }

}void contabilizaAgotados(int[][]inventarioP2){
        int contador=0;
        for (int y = 0; y < inventarioP2.length; y++) {
            int[] fila = inventarioP2[y];
            for (int j = 0; j < fila.length; j++) {
                if (fila[j] == 0) {

                    contador+=1;

                }
            }
        }
    System.out.println("Hay un total de "+contador+" productos agotados");}}
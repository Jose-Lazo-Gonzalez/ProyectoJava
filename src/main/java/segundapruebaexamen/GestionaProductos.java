package segundapruebaexamen;

import java.util.Date;

public class GestionaProductos {

    public static void main(String[] args) {
        // 1. Definimos un array de tipo Producto con un tamaño fijo
        Producto[] inventario = new Producto[10];
        int contador = 0; // Para saber cuántos productos hay realmente

        // 2. Creamos y añadimos los productos al array
        Detergente d1 = new Detergente("DET01", "Ariel", "Líquido", 2.0, 12.0, 6.0, "Ariel", TipoDetergente.MAQUINA, TipoRopa.COLOR);
        inventario[contador] = d1;
        contador++;

        Pescado p1 = new Pescado("PES01", "Merluza", "Fresca", 1.5, 15.0, 8.0, "Cantábrico", new Date(), TipoPescado.BLANCO);
        inventario[contador] = p1;
        contador++;

        Vino v1 = new Vino("VIN01", "Rioja", "Reserva", 0.75, 20.0, 10.0, 0.21, "Muga", TipoVino.TINTO, 14.0);
        inventario[contador] = v1;
        contador++;

        // 3. Recorremos el array para calcular las calorías
        double caloriasTotales = 0;

        System.out.println("--- INVENTARIO DEL SUPERMERCADO ---");

        // Recorremos solo hasta 'contador' para evitar posiciones vacías (null)
        for (int i = 0; i < contador; i++) {
            Producto p = inventario[i];

            System.out.println(p.toString());

            // Usamos instanceof para filtrar los que son Alimento
            if (p instanceof Alimento) {
                // Hacemos el casting a la interfaz Alimento
                Alimento auxAlimento = (Alimento) p;
                caloriasTotales += auxAlimento.getCalorias();
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Total calorías acumuladas: " + caloriasTotales);
    }
}

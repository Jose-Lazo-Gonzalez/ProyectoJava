package orientacionobjetos.Simulacionestudio;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class ControlMisiones {
    public static void main(String[] args) {

        Nave nave1 = new Nave("01", "cargadora", 5000);
        Nave nave2 = new Nave("02", "exploracion", 3000);

        Mexploracion marte = new Mexploracion(111, "Pankeke", LocalDate.of(2026, 3, 5), nave2, "marte", 50);
        Mexploracion jupiter = new Mexploracion(141, "Pankiki", LocalDate.of(2026, 3, 20), nave2, "jupiter", 30);
        Mlogistica aceitunas = new Mlogistica(141, "Comidita", LocalDate.of(2026, 3, 15), nave1, 100);
        Mlogistica desodorante = new Mlogistica(161, "higiene", LocalDate.of(2026, 3, 12), nave2, 40);

        // Array fijo de 4 misiones
        Mision[] misiones = new Mision[4];
        misiones[0] = marte;
        misiones[1] = jupiter;
        misiones[2] = aceitunas;
        misiones[3] = desodorante;

        // Recorrer e imprimir solo misiones de riesgo
        for (Mision m : misiones) {
            if (m.riesgomision()) {
                System.out.println(m);
            }
        }
    }
}


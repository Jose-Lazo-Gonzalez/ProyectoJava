package orientacionobjetos.Simulacionestudio;

import java.time.LocalDate;
import java.util.Objects;

public class Mexploracion extends Mision{
    private String destino;
    private int tamanio;

    public Mexploracion(int codnum, String nombre, LocalDate fechaLanzamiento, Nave naveMision, String destino, int tamanio) {
        super(codnum, nombre, fechaLanzamiento, naveMision);
        this.destino = destino;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Mexploracion{" +
                "codnum=" + codnum +
                '}';
    }

    @Override
    public void fechapasada() {
        LocalDate hoy = LocalDate.now();
        if (hoy.isBefore(fechaLanzamiento)){
            System.out.println("La fecha ya es una fecha pasada a hoy");
        }
    }

    @Override
    public boolean riesgomision() {
        LocalDate hoy = LocalDate.now();
        LocalDate calculo = fechaLanzamiento.minusDays(7);
        if(Objects.equals(destino, "marte") || calculo.isBefore(hoy)) {
            System.out.println("Mision con riesgo");
            return true;
        }

        else {
            return false;
        }
    }
}

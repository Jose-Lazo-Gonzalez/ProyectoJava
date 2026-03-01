package orientacionobjetos.Simulacionestudio;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Mlogistica extends Mision {
    private double carga;

    public Mlogistica(int codnum, String nombre, LocalDate fechaLanzamiento, Nave naveMision, double carga) {
        super(codnum, nombre, fechaLanzamiento, naveMision);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Mlogistica{" +
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
        DayOfWeek dia = fechaLanzamiento.getDayOfWeek();




        if (carga>50 && (dia==DayOfWeek.SUNDAY || dia==DayOfWeek.SATURDAY)){
            System.out.println("Nivel de riesgo alto");
        return true;
        }
        else {
            return false;
        }

    }
}

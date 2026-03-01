package orientacionobjetos.Simulacionestudio;

import java.time.LocalDate;

 public abstract class Mision {
    protected int codnum;
     protected String nombre;
     protected LocalDate fechaLanzamiento;
     protected Nave naveMision;
     protected Estado estado;

    public Mision(int codnum, String nombre, LocalDate fechaLanzamiento, Nave naveMision) {
        this.codnum = codnum;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.naveMision = naveMision;
        this.estado = Estado.planificada;
    }

      public abstract void fechapasada();
      public abstract boolean riesgomision();

}


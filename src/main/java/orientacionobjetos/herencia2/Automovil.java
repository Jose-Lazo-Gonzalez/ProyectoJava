package orientacionobjetos.herencia2;

public class Automovil extends Vehiculo {
    private String calificacionEcologica;


    public Automovil(String dueno, int numasientos, int numpuertas, Tipo tipo, String calificacionEcologica) {
        super(dueno, numasientos, numpuertas, tipo);
        this.calificacionEcologica = calificacionEcologica;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "calificacionEcologica='" + calificacionEcologica + '\'' +
                ", dueno='" + getDueno() + '\'' +
                ", numasientos=" + getNumasientos() +
                ", numpuertas=" + getNumpuertas() +
                ", tipo=" + getTipo() +
                '}';
    }
}

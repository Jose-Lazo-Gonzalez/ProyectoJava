package orientacionobjetos.herencia2;

public class Camion extends Vehiculo {
    private int tonelaje;
    private int numejes;


    public Camion(String dueno, int numasientos, int numpuertas, Tipo tipo, int tonelaje, int numejes) {
        super(dueno, numasientos, numpuertas, tipo);
        this.tonelaje = tonelaje;
        this.numejes = numejes;
    }


    @Override
    public String toString() {
        return "Camion{" +
                "tonelaje=" + tonelaje +
                ", numejes=" + numejes +
                ", dueno='" + getDueno() + '\'' +
                ", numasientos=" + getNumasientos() +
                ", numpuertas=" + getNumpuertas() +
                ", tipo=" + getTipo() +
                '}';
    }
}

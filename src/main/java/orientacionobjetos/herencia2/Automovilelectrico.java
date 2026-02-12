package orientacionobjetos.herencia2;

public class Automovilelectrico extends Automovil {
    private TipoBateria bateria;


    public Automovilelectrico(String dueno, int numasientos, int numpuertas, Tipo tipo, String calificacionEcologica, TipoBateria bateria) {
        super(dueno, numasientos, numpuertas, tipo, calificacionEcologica);
        this.bateria = bateria;
    }
}

package orientacionobjetos.Biblioteca;

public class Juego extends ElementoMultimedia {

    private int numeroFases;

    public Juego(String identificador, String ubicacion, int unidadesTotales,
                 String nombre, String genero, int numeroFases) {
        super(identificador, ubicacion, unidadesTotales, nombre, genero);
        this.numeroFases = numeroFases;
    }

    public int getNumeroFases() {
        return numeroFases;
    }

    @Override
    public int getDevuelveDiasPrestamo() {
        return 10;
    }
}

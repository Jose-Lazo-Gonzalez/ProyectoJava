package orientacionobjetos.Biblioteca;

public class Pelicula extends ElementoMultimedia {

    private int duracionMinutos;

    public Pelicula(String identificador, String ubicacion, int unidadesTotales,
                    String nombre, String genero, int duracionMinutos) {
        super(identificador, ubicacion, unidadesTotales, nombre, genero);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    @Override
    public int getDevuelveDiasPrestamo() {

        return 10;
    }
}

package orientacionobjetos.Biblioteca;

public class Libro implements Prestable {

    private String identificador;
    private String ubicacion;
    private int unidadesTotales;
    private int unidadesPrestadas;

    private String autor;
    private String editorial;
    private String generoLiterario;

    public Libro(String identificador, String ubicacion, int unidadesTotales,
                 String autor, String editorial, String generoLiterario) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.unidadesTotales = unidadesTotales;
        this.unidadesPrestadas = unidadesPrestadas;
        this.autor = autor;
        this.editorial = editorial;
        this.generoLiterario = generoLiterario;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void prestar() {
        if (estaDisponible()) {
            unidadesPrestadas++;
        }
    }

    public void devolver() {
        if (unidadesPrestadas > 0) {
            unidadesPrestadas--;
        }
    }

    @Override
    public boolean estaDisponible() {
        return unidadesPrestadas < unidadesTotales;
    }

    @Override
    public int getDevuelveDiasPrestamo() {
        return 21;
    }
}

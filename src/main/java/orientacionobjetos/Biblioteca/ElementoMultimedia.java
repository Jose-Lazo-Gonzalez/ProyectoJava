package orientacionobjetos.Biblioteca;

public abstract class ElementoMultimedia implements Prestable {

    protected String identificador;
    protected String ubicacion;
    protected int unidadesTotales;
    protected int unidadesPrestadas;

    protected String nombre;
    protected String genero;

    public ElementoMultimedia(String identificador, String ubicacion, int unidadesTotales,
                              String nombre, String genero) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.unidadesTotales = unidadesTotales;
        this.unidadesPrestadas = 0;
        this.nombre = nombre;
        this.genero = genero;
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
}

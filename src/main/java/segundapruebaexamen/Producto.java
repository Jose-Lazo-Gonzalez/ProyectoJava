package segundapruebaexamen;

abstract public class Producto {
    protected String idProducto;
    protected String nombre;
    protected String descripcion;
    protected double peso;
    protected double precioVenta;
    protected double precioCompra;
    protected double iva;

    public Producto(String idProducto, String nombre, String descripcion, double peso, double precioVenta, double precioCompra, double iva) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.iva = iva;
    }

    abstract public double getprecioNeto();
    abstract public double getprecioBruto();

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto='" + idProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", peso=" + peso +
                ", precioVenta=" + precioVenta +
                ", precioCompra=" + precioCompra +
                ", iva=" + iva +
                '}';
    }
}

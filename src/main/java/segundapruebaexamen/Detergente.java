package segundapruebaexamen;

public class Detergente extends Producto implements Liquido, Descuentos {
    private String marca;
    private TipoDetergente tipo;
    private TipoRopa tipoRopal;

    public Detergente(String idProducto, String nombre, String descripcion, double peso, double precioVenta, double precioCompra, String marca, TipoDetergente tipo, TipoRopa tipoRopal) {
        super(idProducto, nombre, descripcion, peso, precioVenta, precioCompra, 0.21);
        this.marca = marca;
        this.tipo = tipo;
        this.tipoRopal = tipoRopal;

    }

    @Override
    public void setDescuento(double des) {

    }

    @Override
    public double getDescuento() {
        return 0;
    }

    @Override
    public double getPrecioDescuento() {
        return 0;
    }

    @Override
    public void setVolumen(double v) {

    }

    @Override
    public double getVolumen() {
        return 0;
    }

    @Override
    public void setTipoEnvase(String env) {

    }

    @Override
    public String getTipoEnvase() {
        return "";
    }

    @Override
    public double getprecioNeto() {
        double precioNeto = 0;
        precioNeto = precioVenta - precioCompra;
        System.out.println("El precio neto es" + precioNeto);
        return precioNeto;

    }

    @Override
    public double getprecioBruto() {
        double precioBruto = 0;
        precioBruto = precioVenta - precioCompra;
        precioBruto = precioBruto - (precioBruto * iva);
        System.out.println("El precio bruto es" + precioBruto);
        return precioBruto;
    }
}

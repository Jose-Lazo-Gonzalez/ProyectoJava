package segundapruebaexamen;

import java.util.Date;

public class Vino extends Producto implements Descuentos,Liquido, Alimento {
    private String marca;
    private TipoVino tipo;
    private double gradosAlcohol;
    private double precio;

    public Vino(String idProducto, String nombre, String descripcion, double peso, double precioVenta, double precioCompra, double iva, String marca, TipoVino tipo, double gradosAlcohol) {
        super(idProducto, nombre, descripcion, peso, precioVenta, precioCompra, iva);
        this.marca = marca;
        this.tipo = tipo;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setCaducidad(Date fecha) {

    }

    @Override
    public Date getCaducidad() {
        return null;
    }

    @Override
    public double getCalorias() {
        double calorias;
        calorias = gradosAlcohol * 10;
        return calorias;
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

package segundapruebaexamen;

import java.util.Date;

public class Pescado extends Producto implements Alimento {
    private String origen;
    private Date tiempo;
    private TipoPescado tipo;

    public Pescado(String idProducto, String nombre, String descripcion, double peso, double precioVenta, double precioCompra, String origen, Date tiempo, TipoPescado tipo) {
        super(idProducto, nombre, descripcion, peso, precioVenta, precioCompra, 0.07);
        this.origen = origen;
        this.tiempo = tiempo;
        this.tipo = tipo;
    }

    @Override
    public void setCaducidad(Date fecha) {

    }

    @Override
    public Date getCaducidad() {
        return tiempo;
    }

    @Override
    public double getCalorias() {
        double calorias=0;
        if (tipo == TipoPescado.AZUL){
            calorias=peso * 3;
        } else if (tipo == TipoPescado.BLANCO) {
            calorias= peso * 2;
        }
        else if (tipo == TipoPescado.MARISCO) {
            calorias=  peso;
    }return calorias;
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

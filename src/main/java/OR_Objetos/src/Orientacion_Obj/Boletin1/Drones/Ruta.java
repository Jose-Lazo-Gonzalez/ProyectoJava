package OR_Objetos.src.Orientacion_Obj.Boletin1.Drones;

import OR_Objetos.src.Orientacion_Obj.Boletin1.Drones.EstadoPaquete;

public class Ruta {

    private String origen;
    private String destino;
    private double pesoPaquete;
    private EstadoPaquete estado;

    public Ruta(String origen, String destino, double pesoPaquete) {
        this.origen = origen;
        this.destino = destino;
        this.pesoPaquete = pesoPaquete;
        this.estado = EstadoPaquete.EN_PREPARACION;
    }

    public void setEstado(EstadoPaquete estado) {
        this.estado = estado;
    }

    public EstadoPaquete getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return origen + " -> " + destino + " | Estado: " + estado;
    }
}


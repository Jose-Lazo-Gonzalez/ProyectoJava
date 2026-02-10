package OR_Objetos.src.Orientacion_Obj.Boletin1.Drones;


public class Dron {

     String identificador;
     int bateria;
     EstadoDron estado;
     double cargaMaxima;
     Ruta ruta;

     Dron(String identificador, double cargaMaxima) {
        this.identificador = identificador;
        this.cargaMaxima = cargaMaxima;
        this.bateria = 100;
        this.estado = EstadoDron.EN_REPOSO;
    }

     void asignarRuta(Ruta ruta) {
        if (estado != EstadoDron.EN_REPOSO) {
            System.out.println("No es posible asignar la ruta pq  "
                    + identificador + " no está en reposo");
        }

        else{
        this.ruta = ruta;
        this.estado = EstadoDron.EN_RUTA;
        ruta.setEstado(EstadoPaquete.EN_REPARTO);
        System.out.println("Ruta asignada al dron " + identificador);}
    }

     void cargarBateria() {
         estado = EstadoDron.CARGANDO;
         bateria = 100;
         estado = EstadoDron.EN_REPOSO;

    }


}


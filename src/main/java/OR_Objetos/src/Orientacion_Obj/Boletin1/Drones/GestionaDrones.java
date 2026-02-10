package OR_Objetos.src.Orientacion_Obj.Boletin1.Drones;

public class GestionaDrones {

    public static void main(String[] args) {


        Ruta paquete1 = new Ruta("Madrid", "Barcelona", 2.5);
        Ruta paquete2 = new Ruta("Sevilla", "Valencia", 3.0);
        Ruta paquete3 = new Ruta("Bilbao", "Zaragoza", 1.2);

        Dron dron1 = new Dron("id1", 5.5);
        Dron dron2 = new Dron("id2",7.5);


        dron1.asignarRuta(paquete1);
        dron2.asignarRuta(paquete2);

        paquete1.setEstado(EstadoPaquete.RETRASADO);
        paquete2.setEstado(EstadoPaquete.CANCELADO);
        dron1.estado=EstadoDron.CARGANDO;
        dron1.asignarRuta(paquete3);
    }
}

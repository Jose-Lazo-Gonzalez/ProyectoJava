package OR_Objetos.src.Orientacion_Obj.Boletin1.Robot;

import OR_Objetos.src.Orientacion_Obj.Boletin1.Drones.EstadoDron;
import OR_Objetos.src.Orientacion_Obj.Boletin1.Drones.EstadoPaquete;

public class Robot {
    String identificador;
    int nivelSuciedad;
    Funcionamiento modoFUncionamiento;
    int bateria;
    String habitacion;

    //constructores


    public Robot(String habitacion, Funcionamiento modoFUncionamiento, int nivelSuciedad, String identificador) {
        this.habitacion = habitacion;
        this.bateria = 100;
        this.modoFUncionamiento = modoFUncionamiento;
        this.nivelSuciedad = nivelSuciedad;
        this.identificador = identificador;
    }

    //metodos

    void asignarHabitacion(String habitacion){
        if (modoFUncionamiento != Funcionamiento.AUTO) {
            System.out.println("No es posible asignar la habitacion pq  "
                    + identificador + " no está en auto");
        }

        else{
            this.habitacion = habitacion;
            System.out.println("Habitacion asignada al robot " + identificador);}
    }
    void vaciarDeposito() {
        nivelSuciedad = 0;
    }
    void cargarBateria() {
        bateria=100;

    }

}


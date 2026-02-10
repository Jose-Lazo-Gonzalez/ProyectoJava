package OR_Objetos.src.Orientacion_Obj.Boletin1.Robot;

import OR_Objetos.src.Orientacion_Obj.Boletin1.Drones.EstadoDron;
import OR_Objetos.src.Orientacion_Obj.Boletin1.Drones.EstadoPaquete;

public class Habitacion {
    String nombre;
    int tamaño;
    int nivelSuciedad;
    EstadoHabitacion estado;


    public Habitacion(EstadoHabitacion estado, int nivelSuciedad, int tamaño, String nombre) {
        this.estado = estado;
        this.nivelSuciedad = nivelSuciedad;
        this.tamaño = tamaño;
        this.nombre = nombre;
    }

    void proceso(){
        if (estado != EstadoHabitacion.BLOQUEADA) {
            System.out.println("No es posible asignar la ahb pq  " + nombre + " esta bloqueada");
        }

        else{

            this.estado = EstadoHabitacion.LIMPIANDO;
            System.out.println("habitacion asignada al robot " + nombre);}
    }
    }


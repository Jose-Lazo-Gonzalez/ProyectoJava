package orientacionobjetos.herencia2;

public class GestionaVehiculo {
    static void main(String[] args) {
        Vehiculo coche1 = new Automovil("Elena",4,4,Tipo.B,"muy buena");
        Vehiculo camion1 = new Camion("Javier",2,2,Tipo.C,1000,8);
        System.out.println(coche1);
        System.out.println(camion1);
    }

}

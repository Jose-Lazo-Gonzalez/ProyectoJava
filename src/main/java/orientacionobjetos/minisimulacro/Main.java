package orientacionobjetos.minisimulacro;

public class Main {
    static void main(String[] args) {
        Conductores juan = new Conductores("Juan", 5);
        Conductores maria = new Conductores("María", 3);

        Sensores sensor1 = new Sensores(0.40, 100); // obstáculo a 40 cm, velocidad 100 km/h
        Coches coche1 = new Coches("Tesla", "Model S", "ABC123", juan, sensor1);

        coche1.arrancar(maria); // María no puede arrancar
        coche1.arrancar(juan);  // Juan arranca

        juan.conducir();

        // Verificar si debe parar (hay obstáculo cercano)
        coche1.parada();
        System.out.println("Estado del coche: " + coche1.getEstado());
    }
}

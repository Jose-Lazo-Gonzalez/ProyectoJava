package orientacionobjetos.minisimulacro;

public class Sensores {
    //atributo
    double distancia;
    int velocidad;

    //constructores

    public Sensores(double distancia, int velocidad) {
        this.distancia = distancia;
        this.velocidad = velocidad;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //metodos
    boolean avisardistancia(){
        if(distancia<0.5){
            System.out.println("Distancia peligrosa");
            return true;
        }
        else {
            return false;
        }
    }
    boolean avisarvelociad(){
        if (velocidad>120){
            System.out.println("La velocidad supera los 120km/h");
            return true;
        }
        else {
            return false;
        }
    }
}

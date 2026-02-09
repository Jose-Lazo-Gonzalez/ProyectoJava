package orientacionobjetos.minisimulacro;

public class Coches {
    //atributos
    String marca;
    String modelo;
    String matricula;
    Conductores propietario;
    Estado estado;
    Sensores sensor;

    //constructores


    public Coches(String marca, String modelo, String matricula, Conductores propietario, Sensores sensor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.propietario = propietario;
        this.estado = Estado.APAGADO;
        this.sensor = sensor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Conductores getPropietario() {
        return propietario;
    }

    public void setPropietario(Conductores propietario) {
        this.propietario = propietario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Sensores getSensor() {
        return sensor;
    }

    public void setSensor(Sensores sensor) {
        this.sensor = sensor;
    }

    //metodo
    public void arrancar (Conductores conductor){
        if (!conductor.equals(propietario)){
            System.out.println("Solo el propietario puede arrancarlo");
        }
        else {
            System.out.println("Arrancando...");
            estado=Estado.ARRANCADO;
        }
    }
    public void parada(){
        if (estado==Estado.ARRANCADO){
            if (sensor.avisardistancia()){
                estado=Estado.APAGADO;
            }
        }
    }
}

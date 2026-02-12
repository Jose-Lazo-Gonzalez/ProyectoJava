package orientacionobjetos.herencia2;

public class Vehiculo {

    private String dueno;
    private int numAsientos;
    private int numPuertas;
    private Tipo tipo;

    // Constructor
    public Vehiculo(String dueno, int numAsientos, int numPuertas, Tipo tipo) {
        this.dueno = dueno;
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.tipo = tipo;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    // Método conducir
    public void conduce() {
        System.out.println("El vehículo está siendo conducido.");
    }

    // Verifica que el dueño tenga solo letras
    public boolean tieneDuenoValido() {
        return dueno != null && dueno.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    // Verifica si tiene limitación según ciudad y tipo
    public boolean tieneLimitacion(String ciudad) {

        if (ciudad == null) {
            return false;
        }

        ciudad = ciudad.toLowerCase();


        if (ciudad.equals("madrid") || ciudad.equals("barcelona")) {
            if (tipo == Tipo.B || tipo == Tipo.C) {
                return true;
            }
        }


        if (ciudad.equals("valencia") || ciudad.equals("sevilla")) {
            if (tipo == Tipo.C) {
                return true;
            }
        }
            return false;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "dueno='" + dueno + '\'' +
                ", numAsientos=" + numAsientos +
                ", numPuertas=" + numPuertas +
                ", tipo=" + tipo +
                '}';
    }
}


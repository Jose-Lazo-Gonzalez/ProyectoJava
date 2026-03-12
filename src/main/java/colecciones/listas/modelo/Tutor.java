package colecciones.listas.modelo;

public class Tutor {
    private String aula;
    private Horario horario;


    public Tutor(String aula, Horario horario) {
        this.aula = aula;
        this.horario = horario;
    }

    public Tutor() {
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "aula='" + aula + '\'' +
                ", horario=" + horario +
                '}';
    }
}

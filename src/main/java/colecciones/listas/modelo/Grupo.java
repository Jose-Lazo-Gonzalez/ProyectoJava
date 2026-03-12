package colecciones.listas.modelo;

import java.util.List;

public class Grupo {
    private int identificador;
    private String descripcion;
    private List<Estudiante> estudiantes;
    private Tutor tutor;


    public Grupo(int identificador, String descripcion, List<Estudiante> estudiantes, Tutor tutor) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.tutor = tutor;
    }

    public Grupo(int identificador, String descripcion, Tutor tutor) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.tutor = tutor;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Grupo(int identificador) {
        this.identificador = identificador;
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    public void mostrarEstudiantes(){
        for (Estudiante estudiante:estudiantes){
            System.out.println(estudiante);
            System.out.println(estudiante.getNotas());
        }
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", numero de estudiantes=" + estudiantes.size() +
                ", tutor=" + tutor +
                '}';
    }
    public int mediaNotasGrupo(){

        int sumando = 0;
        for(Estudiante estudiante: estudiantes){
            sumando+= estudiante.mediaNotas();
        }
        int media= sumando / estudiantes.size();
        System.out.println(media);
        return media;
    }
}

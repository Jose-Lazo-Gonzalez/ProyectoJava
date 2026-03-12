package colecciones.listas.modelo;

import java.util.List;
import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int identificador;
    private List<Integer> notas; //me lo ha dicho elena, tipo integer pa los int en las listas por lo de primitivo y to la paranoia


    public Estudiante(String nombre, int identificador, List<Integer> notas) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.notas = notas;
    }

    public Estudiante(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
    //no entiendo lo de se identifican por su identificador
    public int mediaNotas(){
        int sumando = 0;
        for (Integer nota:notas ){
            sumando+=nota;
        }
        int media=sumando /notas.size();
        System.out.println(media);
        return media;
    }
}

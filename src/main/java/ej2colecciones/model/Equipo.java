package ej2colecciones.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

    private String nombre;
    private List<Alumno> alumnos;

    public Equipo(String nombre, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>(alumnos);
    }
    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
        System.out.println("Alumno añadido");
    }
    public void deleteAlumno(Alumno alumno){
        alumnos.remove(alumno);
        System.out.println("Alumno borrado del equipo");
    }
    public Alumno comprobacion(Alumno alumno){
        Alumno alumnoEncontrado;
        if (alumnos.contains(alumno)){
            alumnoEncontrado=alumno;
            System.out.println("El alumno esta en el equipo");
        }
        else {
            alumnoEncontrado=null;
            System.out.println("El alumno no esta en el equipo");

        }
        return alumnoEncontrado;
    }
    public void mostrarlista(){

        for(Alumno alumno:alumnos){
            System.out.println(alumno);
        }
    }
    public Equipo unirEquipo(Equipo equipo){

        List<Alumno> union = new ArrayList<Alumno>(alumnos);
        union.addAll(equipo.alumnos);

        return new Equipo("maxi", union);
    }

    public Equipo interseccionEquipo(Equipo equipo){

        List<Alumno> inter = new ArrayList<>(alumnos);
        inter.retainAll(equipo.alumnos);
        return new Equipo("maxi", inter);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre) && Objects.equals(alumnos, equipo.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, alumnos);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}

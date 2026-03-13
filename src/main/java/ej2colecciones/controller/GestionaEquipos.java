package ej2colecciones.controller;

import ej2colecciones.model.Alumno;
import ej2colecciones.model.Equipo;

import java.util.ArrayList;

public class GestionaEquipos {




        public static void main(String[] args) {

            // Crear alumnos
            Alumno a1 = new Alumno("Ana","48101004R");
            Alumno a2 = new Alumno("Luis","43101004R");
            Alumno a3 = new Alumno("Carlos","78102304R");
            Alumno a4 = new Alumno("Marta","58101454R");

            // Equipos vacíos
            Equipo equipo1 = new Equipo("Equipo A", new ArrayList<>());
            Equipo equipo2 = new Equipo("Equipo B", new ArrayList<>());
            System.out.println(equipo1);
            System.out.println(equipo2);

            // Añadir alumnos
            equipo1.addAlumno(a1);
            equipo1.addAlumno(a2);
            equipo1.addAlumno(a3);

            equipo2.addAlumno(a2);
            equipo2.addAlumno(a3);
            equipo2.addAlumno(a4);

            System.out.println("Equipo 1:");
            equipo1.mostrarlista();

            System.out.println("Equipo 2:");
            equipo2.mostrarlista();



            // Unión
            Equipo union = equipo1.unirEquipo(equipo2);
            System.out.println("Union:");
            union.mostrarlista();

            // Intersección
            Equipo inter = equipo1.interseccionEquipo(equipo2);
            System.out.println("Interseccion:");
            inter.mostrarlista();
        }
    }


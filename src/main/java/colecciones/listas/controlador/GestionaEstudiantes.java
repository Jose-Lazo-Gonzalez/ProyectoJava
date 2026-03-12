package colecciones.listas.controlador;

import colecciones.listas.modelo.Estudiante;
import colecciones.listas.modelo.Grupo;
import colecciones.listas.modelo.Instituto;
import colecciones.listas.modelo.Tutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionaEstudiantes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instituto instituto = new Instituto();
        Tutor t1 = new Tutor();
        Tutor t2 = new Tutor();
        Grupo g1 = new Grupo(01,"Buen grupo", t1);
        Grupo g2 = new Grupo(02,"Mal grupo",t2);
        int opcion;
        do {
            System.out.println(" GESTIÓN INSTITUTO");
            System.out.println("1. Agregar Estudiante a lista");
            System.out.println("2. Agregar Grupo a instituo");
            System.out.println("3. Mostrar Estudiantes y Notas por Grupo");
            System.out.println("4. Información Básica de Grupo");
            System.out.println("5. Promedio de Estudiante (por ID)");
            System.out.println("6. Promedio de Grupo");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Grupo g = instituto.getGrupos().get(instituto.getGrupos().size() - 1);
                    System.out.print("Nombre Alumno: "); String nom = sc.nextLine();
                    System.out.print("ID Alumno: "); int idA = sc.nextInt();
                    Estudiante e = new Estudiante(nom, idA);
                    System.out.print("Introduce una nota: "); e.getNotas().add(sc.nextInt());
                    g.getEstudiantes().add(e);




                    break;
                case 2:
                    System.out.print("ID Grupo: "); int idG = sc.nextInt();
                    System.out.print("Descripción: "); String desc = sc.nextLine();
                    System.out.println("Se le asignara automaticamente un tutor");//no me da tiempo a repetir el mismo proceso para instanciar tutor
                    instituto.getGrupos().add(new Grupo(idG, desc,t1 ));

                    break;

                case 3:
                    for (Grupo h : instituto.getGrupos()) {
                        System.out.println("Grupo: " + h);
                        for (Estudiante i : h.getEstudiantes())
                            System.out.println(" - " + i.getNombre() + " Notas: " + i.getNotas());}

                        break;

                        case 4:
                            for (Grupo o : instituto.getGrupos()) {
                                System.out.println(o);
                            }
                            break;

                        case 5:
                            System.out.print("ID Estudiante: "); int idBusq = sc.nextInt();
                            for (Grupo l : instituto.getGrupos()) {
                                for (Estudiante a : l.getEstudiantes()) {
                                    if (a.getIdentificador() ==idBusq){
                                        System.out.println("Promedio: " + a.mediaNotas());}}}
                            break;

                        case 6:
                            System.out.println("Notas por grupo: ");
                            for (Grupo v : instituto.getGrupos()){
                                System.out.println("ID: "+ v.getIdentificador()+ " y sus notas: "+v.mediaNotasGrupo());
                            }

                            break;
            }
        } while (opcion != 0);
    }
}






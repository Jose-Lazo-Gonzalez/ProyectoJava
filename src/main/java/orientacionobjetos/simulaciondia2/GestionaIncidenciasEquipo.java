package orientacionobjetos.simulaciondia2;

import java.time.LocalDate;

public class GestionaIncidenciasEquipo {

    public static void main(String[] args) {


        Usuario u1 = new Usuario("111A", "Juan", "IT");
        Usuario u2 = new Usuario("222B", "Ana", "IT");
        Usuario u3 = new Usuario("333C", "Luis", "IT");
        Usuario u4 = new Usuario("444D", "Marta", "IT");


        Equipo e1 = new Equipo("pcJuan", "3C:D9:2B:88:99:AA", "Windows 11", u1);
        Equipo e2 = new Equipo("pcAna", "AA:BB:CC:DD:EE:01", "Ubuntu", u2);
        Equipo e3 = new Equipo("pcLuis", "AA:BB:CC:DD:EE:02", "Windows 10", u3);
        Equipo e4 = new Equipo("pcMarta", "AA:BB:CC:DD:EE:03", "MacOS", u4);



        Incidencia i1 = new Incidencia(
                1,
                "Actualización JDK",
                "Error al actualizar",
                "07/02/2026",
                Criticidad.GRAVE,
                e1);

        Incidencia i2 = new Incidencia(
                2,
                "Virus detectado",
                "Malware activo",
                "17/02/2026",
                Criticidad.CRITICA,
                e2);

        Incidencia i3 = new Incidencia(
                3,
                "Lentitud sistema",
                "Sistema muy lento",
                "08/01/2026",
                Criticidad.MEDIA,
                e1);

        Incidencia i4 = new Incidencia(
                4,
                "Teclado roto",
                "No funciona la tecla enter",
                "17/02/2026",
                Criticidad.LEVE,
                e3);


        System.out.println("=== EQUIPOS ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e4);


        System.out.println("INCIDENCIAS");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);


        System.out.println("INCIDENCIAS URGENTES");

        if (i1.esUrgente()) System.out.println(i1);
        if (i2.esUrgente()) System.out.println(i2);
        if (i3.esUrgente()) System.out.println(i3);
        if (i4.esUrgente()) System.out.println(i4);
    }
}


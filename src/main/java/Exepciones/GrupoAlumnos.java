package Exepciones;

public class GrupoAlumnos {
    private String [] nombre;
    private String [] apellidos;

    public GrupoAlumnos(String[] apellidos, String[] nombre) {
        this.setApellidos(apellidos) ;
        this.setNombre(nombre) ;


    }

    public GrupoAlumnos() {
        nombre = new String [20];
        apellidos = new String [20];
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        if (nombre.length > 20){
            try {
                throw new NullPointerException("LLegan mas de 20 nombres");
            } catch (NullPointerException a) {
                System.out.println("Ha ocurrido una excepcion" + a.getMessage());
            }finally {
                System.out.println("se ejecuta el finally");
            }
        }

        this.apellidos = apellidos;
        System.out.println("Ha llegao");
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        if (apellidos.length > 20){
            try {
                throw new ClassCastException("LLegan mas de 20 apellidos");
            } catch (ClassCastException e) {
                System.out.println("Ha ocurrido una excepcion" + e.getMessage());
            }finally {
                System.out.println("se ejecuta el finally");
            }
        }

        this.apellidos = apellidos;
        System.out.println("Ha llegao");
    }
}

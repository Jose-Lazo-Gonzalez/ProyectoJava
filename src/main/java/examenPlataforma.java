public class examenPlataforma {
    static void main(String[] args) {
        examenPlataforma ref=new examenPlataforma();
        boolean validadofinal;
        String cadenote;
        String[]usuarios=new String[10];
        String[]claves=new String[10];
        cadenote="alex{netflix23};bea{hbo_pass};carlos{prime99};dani{disneyPlus1};elena{movistar22};fran{sky_77};laura{atresPlayer};pablo{filmin88};sofia{stream2024};admin{root}";
        ref.gestionaCadena(usuarios,claves,cadenote);
        ref.resumen(usuarios,claves);
        ref.busqueda(usuarios, claves, "carlos");
        ref.busqueda(usuarios, claves, "carla");

        validadofinal=ref.validacion(usuarios,claves,"carlos","prime99");
        System.out.println(validadofinal);
    }
    void gestionaCadena(String[]usuarios, String[]claves, String cadenote){
        String[]cadenoteSeparao;
        String[]mejunge;



        cadenoteSeparao=cadenote.split(";");
        for(int i =0; i< cadenoteSeparao.length;i++){
            mejunge=cadenoteSeparao[i].split("\\{");
            usuarios[i]=mejunge[0];
            claves[i]=mejunge[1];
        }
        for(int i =0; i< cadenoteSeparao.length;i++){
            claves[i]=claves[i].replace("}","");
        }

    }
    int busqueda(String[]usuarios, String[]claves, String nombre){
        String nombreGeneral=nombre.toUpperCase();
        int posicion=-1;
        boolean encontrado=false;
        String[]usuariosGeneral=new String[10];
        for(int a = 0; a < 10; a++) {
            usuariosGeneral[a] = usuarios[a].toUpperCase();
        }
        for (int b=0; b<10;b++){
            if(usuariosGeneral[b].equals(nombreGeneral)){
                System.out.println("Usuario encontrado, se encuenta en la posicion "+ b);
                 encontrado=true;
                 posicion=b;

            }
        }
        if(!encontrado){
            System.out.println("No se ha encontrado al sujeto, posicion: -1");
        }
        return posicion;


    }
    boolean validacion(String[]usuarios,String[]claves,String nombre,String clave){
        int posicion;
        boolean validado;
        posicion=busqueda(usuarios,claves, nombre);

        if(clave.equals(claves[posicion])){
            validado=true;
            System.out.println("El usuario se encuentra en el sistema con su clave");
        }
        else {
            System.out.println("El usuario no se encuentra en el sistema o su clave no corresponde");
            validado=false;
        }
        return validado;

    }
    void resumen(String[]usuarios, String[]claves){
        System.out.println("Lista de usuarios:");
        for(int i=0;i<usuarios.length;i++){
            System.out.println(usuarios[i]);
        }
        System.out.println("Lista de claves:");
        for(int i=0;i<usuarios.length;i++){
            System.out.println(claves[i]);
        }
    }
}

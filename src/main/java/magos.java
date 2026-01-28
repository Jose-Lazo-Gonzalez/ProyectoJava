import java.util.Scanner;

public class magos {
    static void main(String[] args) {
        magos ref = new magos();
        Scanner sc= new Scanner(System.in);
        System.out.println("Usuario entrando: ");
        String usuarioLeido= sc.next();
        System.out.println("Clave de acceso: ");
        String claveLeida= sc.next();



        boolean validacion= ref.validarAcceso(claveLeida);
        if (validacion){
            System.out.println(" Acceso concedido");
            System.out.println("Introduzca el mensaje a purificar y cifrar");
            sc.nextLine(); // limpiar buffer
            String mensajeSucio = sc.nextLine();
            String purificado= ref.limpiar(mensajeSucio);
            System.out.println("El mensaje purificado es: ");
            System.out.println(purificado);
            System.out.println("Preparando cifrado...");
            ref.cifradoDelConjuro(purificado);
        }

    }
    boolean validarAcceso( String pass){
        if((pass.contains("#")|| pass.contains("*")) && (pass.length() > 8)){
            return true;
        }
        else {
            return false;
        }
    }
   String limpiar (String conjuro){
    String buenconjuro=conjuro.replace("maldicion","bendicion");
       return buenconjuro.toUpperCase();
}
    void cifradoDelConjuro(String texto) {
        String textocifrado = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textocifrado += texto.charAt(i);
        }

        System.out.println("El texto tiene un total de " + texto.length() + " caracteres");
        System.out.println("El texto cifrado es: " + textocifrado);
    }

}

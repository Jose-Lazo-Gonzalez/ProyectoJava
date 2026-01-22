import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pruebaExpRegulares {
    static void main() {
        String numeros = "4816464163132463546374634676469546549687646446549859569549";

        String patron= "\\d*";

        if (numeros.matches(patron)){
            System.out.println("Hay solo numeros");

        }

       String letras5="abcde";
        String patron2="^\\[a-z]{5}$";
        if (letras5.matches(patron2));{
            System.out.println("hay 5 letras minusculas");
        }

        String letra8="abcdefghy";
        String patron3="^\\w{8,}$";
        if(letra8.matches(patron3)){
            System.out.println("Hay 8 caracteres minimo");
        }

        String matricula="6210KNB";
        String patron4="^\\d{4}[A-Z]{3}$";
        if(matricula.matches(patron4)){
            System.out.println("La matricula es correcta");
        }
        String grado="DAMiselabella";
        String patron5="^\\DAM\\w*";
        if(grado.matches(patron5)){
            System.out.println("El grado esta bien");
        }
        String frasenumero="Asiodjsa98ud89qw89ecuqw897e0q2udo9auy8rfywq33r78fw3";
        String patron6="[0-9]";
        Pattern papa = Pattern.compile(patron6);
        Matcher popo = papa.matcher(frasenumero);
        if(popo.find()){
            System.out.println("Hay un digito en la cadena");
            System.out.println(popo.group());
        }
        String[] dnis = {
                "12345678Z",
                "8765432X",
                "112233445A",
                "99887766",
                "ABCDEF12Z",
                "44556677c",
                "33445566- D",
                "00000000T",
                "99999999R",
                "1234A678Z"
        };
        ;
        String patron7 = "\\d{8}[A-Z]";
        Pattern pattern = Pattern.compile(patron7);

        System.out.println("DNIs válidos:");

        for (String dni : dnis) {
            Matcher matcher = pattern.matcher(dni);

            if (matcher.matches()) {
                System.out.println("Es valido:");
                System.out.println(dni);
            }
        }


}}

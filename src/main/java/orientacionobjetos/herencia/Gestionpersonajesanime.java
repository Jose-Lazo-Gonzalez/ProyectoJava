package orientacionobjetos.herencia;


import orientacionobjetos.herencia3.Personaje;

public class Gestionpersonajesanime {
    static void main(String[] args) {
        Serieanime onepiece= new Serieanime("one piece", "ELena");
        Luffy luffy =new Luffy("Luffy");//Todo lo de personaje anime y todo lo de luffy, siempre luffy
        Personajeanime luffy1=new Luffy("Luffy");//tiempo de compilacion es personaje anime y en tiempos de ejecucion es tipo luffy
        //Luffy luffy2= new Personajeanime("luffy2"); no compila porque en compilacion es luffy y en ejecucion es personaje anime y supone perder info por eso da fallo
        //Luffy luffy2=(Luffy) new Personajeanime("luffy2");//fuerzas a que sea tipo luffy, hago un casting explicito desde personaje animne a luffy
        luffy.setSerie(onepiece);
        System.out.println(luffy);



    }
}

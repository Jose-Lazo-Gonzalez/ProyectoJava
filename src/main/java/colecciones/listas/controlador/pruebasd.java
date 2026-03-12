package colecciones.listas.controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class pruebasd {
    static void main(String[] args) {
        List<String> ciudades = new LinkedList<String>();
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Sevilla");
        ciudades.add("Madrid"); //repetido

//Iteramos sobre el conjunto
        Iterator<String> itr = ciudades.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());}


        List <String>listaArray = new ArrayList<String>();
        listaArray.add ("Barcelona");
        listaArray.add("Huelva");
        listaArray.add("Madrid");
        System.out.println(listaArray.contains("Madrid"));

        for (String cadena: listaArray){
            System.out.println(cadena);

        }
        for (int i = 0;i< listaArray.size();i++){
            System.out.println(listaArray.get(i));
        }
    }


}

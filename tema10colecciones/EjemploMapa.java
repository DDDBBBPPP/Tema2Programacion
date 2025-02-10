package tema10colecciones;

import java.util.HashMap;
import java.util.Map;

public class EjemploMapa {
    public static void main(String[] args) {
        HashMap<Integer,String> datos = new HashMap<Integer,String>();
        datos.put(922, "Amalia Núñez");
        datos.put(921, "Cindy Nero");
        datos.put(700, "César Vázquez");
        datos.put(219, "Victor Tila");
        datos.put(537, "Alan Brito");
        datos.put(645, "Esteban Quito");
        // Se muestra bomba
        System.out.println("Los elementos del mapa son: " + datos);

        //En particulr
        System.out.println(datos.get(219));

        System.out.println("\n Mostramos el mapa");
        // Lo muestro como un conjunto
        System.out.println(datos.entrySet());

        // Los objetos dentro de este SET es de tipo Map.entry
        
       // ESTO TENGO QUE VERLO EN INTERNET NO ME FUNCIONA.

    }
}

package tema10colecciones;

import java.util.HashMap;
import java.util.Map;

public class EjemploMapas {
    //diccionario
    public static void main(String[] args) {
        HashMap<Integer, String> datos=new HashMap<Integer, String>();
        datos.put(922, "Amalia Nuñez");
        datos.put(921, "Cindy Nero");
        datos.put(700, "Cesar");
        datos.put(219, "Aitor Tilla");

        System.out.println(datos);
        System.out.println(datos.get(219));
        System.out.println(datos.containsKey(700)?datos.get(700):"No esta");
        System.out.println(datos.containsKey(701)?datos.get(701):"No esta");

        System.out.println("recoremos el mapa");
        System.out.println(datos.entrySet()); //saca un conjunto
        
        for (Map.Entry<Integer, String> item : datos.entrySet()) {// En esta linea el diamante es opcional
            System.out.println(item.getValue());
        }
        
        System.out.println("recoremos el mapa 2");
        System.out.println(datos.values()); //conjunto tipo string

        for (String string : datos.values()) {
            System.out.println(string);
        }
        System.out.println(datos.keySet()); //conjunto tipo string

        for (int string : datos.keySet()) {
            System.out.println(string);
        }
    }

}

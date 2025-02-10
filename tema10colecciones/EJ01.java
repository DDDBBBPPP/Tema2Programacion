package tema10colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Crea un ArrayList con los nombbres de 6 comoañeros a continuacion muestra por pantallas.
 * Mostrar por pantalla sin indice.
 */
public class EJ01 {

     public static void main(String[] args) {
        int x; // tipo primitivo int
        Integer y; // Wrapper envuelve al tipo primitivo y lo convierte en un objeto
        // Pero se le puede asignar un valor, sin hacer el new Integer();
        ArrayList<String> listado = new ArrayList<String>();

        listado.add("Paco");
        listado.add("Migue");
        listado.add("Antonio");
        listado.add("Hugo");
        listado.add("Gloria");
        listado.add("Manuel");

        //Mostrar lo mismo pero con índice
        for(String item : listado){
            System.out.println(item);
        }

        //Con índice
        for(int i = 0;i<listado.size();i++){
          System.out.println(listado.get(i));  
        }
        // Devuelve -1 si no lo encuentra.
        System.out.println(listado.indexOf("Gloria"));
        System.out.println(listado.indexOf("Marcos"));

        //
        //listado.removeIf(FUNCION LAMBDA)
        /*
         * Función LAMBDA o anónima. No tiene nombre, pero reciben y devuelven cosas
         * (Parámetros)operador flecha ->{}
         */
        //Eliminamos todos aquellos alumnos cuyo nombre contenga la 'e'
        //listado.removeIf((nombre)->{return nombre.contains("e");});
        //Me puedo ahorrar el return, los corchetes y el punto y coma si solo es una instruccion
        // El método removeIf con la funcion.
        //1 parámetro del tipo indicado en <> al definir el ArrayList
        // La lambda devuelve true/false

        //Ordenar la colección La clase Collections hay que importarla
        // Y lo ordena ya pos de forma normal.
        Collections.sort(listado);

        //mostramos el orden
        for(String item : listado){
            System.out.println(item);
        }
     }
}

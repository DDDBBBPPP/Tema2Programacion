package tema10colecciones;

import java.util.HashSet;

public class EjemploConjuntos {
    public static void main(String[] args) {
        
        HashSet<String> palabras = new HashSet<String>();
        HashSet<String> datos = new HashSet<String>();
        //añadimos palabras
        palabras.add("Cuchara");
        palabras.add("Palabra");
        palabras.add("Cuchara");
        palabras.add("Rimbombante");
        palabras.add("Tenedor");
        palabras.add("Esternocleidomastoideo");
        palabras.add("Astigmatismo");
        datos.add("Vacaciones");
        datos.add("Suspenso");
        datos.add("Mandarina");
        datos.add("Gato");
         datos.add("Astigmatismo");

        // mostramos el total de palabras contenidas.
        System.out.println("Hay un total de " + palabras.size() + " palabras");

        // Mostramos palabras
        System.out.println("Palabras");
        mostrar(palabras);

         // Mostramos palabras
         System.out.println("Datos");
         System.out.println();
         mostrar(datos);
        

        // NECESITAMOS EL CASTING // PENDIENTE DE SABER PQ NO VALE.
     /*  for(String item: palabras.toArray()){
        System.out.println(item);
      }
       } */

        // Ahora hacemos la union JUNTA LOS DOS.
        
        System.out.println("\nHacemos la unión de conjuntos");
        palabras.addAll(datos);
        mostrar(palabras);


        // Ahora hacemos la interseccion DEJA LOS COMUNES
        
        System.out.println("\nHacemos la intersección de conjuntos");
        palabras.retainAll(datos);
        mostrar(palabras);

             // Ahora hacemos la diferencia ELIMINA LOS COMUNES
        
        System.out.println("\nHacemos la diferencia de conjuntos");
        palabras.removeAll(datos);
        mostrar(palabras);

    }
    /**
     * Mostrar
     * @param conjunto
     */
    public static void mostrar ( HashSet <String> conjunto){
        for(String item: conjunto){
            System.out.println(item);
        }
    }
}

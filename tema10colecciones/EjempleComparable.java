package tema10colecciones;
import tema10colecciones.clases.Gato;
import java.util.ArrayList;
import java.util.Collections;

public class EjempleComparable {

    public static void main(String[] args) {
        
        ArrayList<Gato> gatetes = new ArrayList<Gato>();
        gatetes.add(new Gato("Garfield","naranja",5));
        gatetes.add(new Gato("Silvestre","negro",10));
        gatetes.add(new Gato("Jinks","naranja",16));
        gatetes.add(new Gato("Doraemon","azul",1000000));
        gatetes.add(new Gato("Salem","negro",150));
        gatetes.add(new Gato("Gato con Botas","naranja",7));


        for(Gato item : gatetes){
            System.out.println(item);
        }
        //No puedes ordenar objetos.
       // Collections.sort(gatetes);

       // Ahora comparamos objetos al ser de tipo comparable.
    /*    Gato garfiel = new Gato("Garfield","narana", 5);
       Gato silves = new Gato("Sil","nagf", 14);

       garfiel.compareTo(silves); */

       // Ahora comparamos objetos al ser de tipo comparable.
       System.out.println();
       System.out.println();
        System.out.println("Colección ordenada.");
        Collections.sort(gatetes);

        for(Gato item: gatetes){
            System.out.println(item);
        }





    }
    
}

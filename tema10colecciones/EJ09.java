package tema10colecciones;

/**
 * Programación
 * curso 2024|25
 * @author Antonio J. Sánchez Bujaldón
 */


 import java.util.ArrayList;
 import java.util.Collections;
 import tema10colecciones.clases.Carta;
 
 public class EJ09 {
 
     public static void main(String[] args) {
         
         Carta carta ;
         ArrayList<Carta> baraja = new ArrayList<Carta>() ;
 
         for(int i=1; i <= 10; i++) {
             do {
                 carta = new Carta() ;
             } while (baraja.contains(carta)) ;
 
             // añadimos la carta a la baraja
             baraja.add(carta) ;
         }
 
         System.out.println("ANTES DE ORDENAR.") ;
         mostrarBaraja(baraja);
 
         // ordenar la baraja
         Collections.sort(baraja) ;
 
         System.out.println("DESPUÉS DE ORDENAR.") ;
         mostrarBaraja(baraja);
 
     }
 
     /**
      * @param baraja
      */
     private static void mostrarBaraja(ArrayList<Carta> baraja) {
         for(Carta item : baraja) {
             System.out.println(item) ;
         }
 
         System.out.println("==========================\n\n");
     }
     
 }

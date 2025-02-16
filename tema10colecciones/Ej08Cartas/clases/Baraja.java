package tema10colecciones.Ej08Cartas.clases;

import java.util.ArrayList;

public class Baraja {

    ArrayList<Carta> baraja;
    
    public Baraja(){
        baraja = new ArrayList<Carta>();
    }
/**
 * Aquí comprobamos si hay hueco.
 * @param numero
 * @param palo
 * @return
 */
    public boolean comprobar(int numero,String palo){

        boolean posible = true;
        for(Carta item: baraja){
            if(item.getNumero()==numero && item.getPalo().equals(palo)){
                posible = false;
            }
        }
        return posible;
    }

    public void sumar(Carta carta){
        baraja.add(carta); 
    }

    public boolean valoresCorrectos(int n, String p){
        boolean posible = false;
        if(n>=1 && n<13){
            if(p.equals("Corazones") || p.equals("Espadas") || p.equals("Bastos") || 
                p.equals("Oros")  ){
                    posible = true;
                }
        }
        return posible;
    }

    

}




package tema10colecciones;

import java.util.ArrayList;

public class Ej02 {
    // RELLENAR RANDOM Y SUMA MEDIA VALOR MAX.
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        int i;
        int maximo;
        int minimo;
        int media;
        int suma = 0;
        int cant = (int) ((Math.random()*(21-10)) + 10);

        for(i=0;i<cant;i++){
            valores.add((int)((Math.random()*(101-0)) + 0));
        }
        //  Asignamos máximo y mínmo
        maximo = valores.get(0);
        minimo = valores.get(0);
        // PRIMERO LO MOSTRAMOS

        for(Integer item: valores){
            System.out.print(item + " ");
        }

        //
        for(i = 0 ; i<valores.size();i++){
          suma +=  valores.get(i);
          if(valores.get(i)>maximo){
            maximo = valores.get(i);
          }
          if(valores.get(i)< minimo){
            minimo = valores.get(i);
          }
        }

        //Mostramos el final.
        System.out.println("\nLa suma es " + suma + ".\nLa media da " + 
        (suma/valores.size()) + ".\nEl máximo es "+ maximo + ".\nEl mínimo es "
        + minimo + "." );

    }
}

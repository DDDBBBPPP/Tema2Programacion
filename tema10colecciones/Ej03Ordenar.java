package tema10colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ej03Ordenar {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int i;

        // Introducimos los datos
        System.out.println("Introduce los datos y pulsa enter.");
        for (i = 0; i < 10; i++) {

            numeros.add(Integer.parseInt(System.console().readLine()));
        }

        for (Integer item : numeros) {
            System.out.print(item + " ");
        }

        Collections.sort(numeros);
        System.out.println();
        for (Integer item : numeros) {
            System.out.print(item + " ");
        }
    }
}

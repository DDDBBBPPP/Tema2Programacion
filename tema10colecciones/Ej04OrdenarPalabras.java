package tema10colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ej04OrdenarPalabras {
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<String>();
        int i;

        // Introducimos los datos
        System.out.println("Introduce los datos y pulsa enter.");
        for (i = 0; i < 10; i++) {

            numeros.add(System.console().readLine());
        }

        for (String item : numeros) {
            System.out.print(item + " ");
        }

        Collections.sort(numeros);
        System.out.println();
        for (String item : numeros) {
            System.out.print(item + " ");
        }
    }
}

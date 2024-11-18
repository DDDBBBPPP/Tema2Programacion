package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio39Primo {
    public static void main(String[] args) {
        int aumento;
        int num;
        int contador = 2;
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Introduce un número entero positivo: ");
            num = sc.nextInt();
            aumento = num;
            for (; aumento < (num + 5); aumento++) {
                // AQUI ESTA BIEN HECHO EL ALGORITMO DE PRIMOS.
                while (contador <= (aumento / 2) && (aumento % contador) != 0) {
                    contador++;
                }

                if (contador > (aumento / 2)) {
                    System.out.println(aumento + " ES primo");
                } else {
                    System.out.println(aumento + " NO es primo");
                }
                contador = 2;
            }
        } catch (InputMismatchException e) {
            System.out.println(" Necesito que el número sea positivo y ENTERO.");
        } finally {
            sc.close();
        }
    }
}

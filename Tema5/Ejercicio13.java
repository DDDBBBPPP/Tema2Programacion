package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int ejemplo;
        int contador = 2;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduzca un número entero: ");
            ejemplo = sc.nextInt();

            if (ejemplo <= 1) {
                System.out.println("El número introducido no es primo.");
            } else {

                while ((contador < ejemplo) && (ejemplo % contador != 0)) {
                    contador++;
                }
                if (contador == ejemplo) {
                    System.out.println("El número es primo.");
                } else {
                    System.out.println("El número no es primo.");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduzca un número entero.");
        } finally {
            sc.close();
        }
    }
}

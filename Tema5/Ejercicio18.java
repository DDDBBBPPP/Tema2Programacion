package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int num;
        int maximo = -2;
        int suma = 0;
        int contador = 0;
        int contadorImpar = 0;
        Scanner sc = new Scanner(System.in);

        // Empezamos a controlar excepciones

        try {

            System.out.println(
                    "Por favor, vaya introduciendo números enteros. \nPuede terminar mediante la introducción   de un número negativo.");
            do {
                num = sc.nextInt();

                if (num >= 0) {
                    contador++;
                    if (num % 2 != 0) {
                        contadorImpar++;
                        suma = suma + num;

                    } else {
                        if (num >= maximo) {
                            maximo = num;
                        }

                    }
                }

            } while (num >= 0);


            // Salida por pantalla final
            System.out.println("Ha introducido " + contador + " números positivos.");

            if (contadorImpar > 0) {
                System.out.println("La media de los impares es " + ((float) suma/contadorImpar) + ".");
            } else {
                System.out.println("No se han introducido valores impares.");
            }
            if (maximo > 0 ) {
                System.out.println("El máximo de los pares es " + maximo + ".");

            } else {
                System.out.println("No se han introducido valores pares.");
            }

            // Vemos que excepcion puede ser y ponemos un mensaje si entrega otro tipo de
            // valor que no sea entero.

        } catch (InputMismatchException e) {

            System.out.println("Introduzca números enteros.");
        } catch (Exception e) {

            System.out.println("El error es " + e.getMessage());
            System.out.println("La clase de este error es " + e.getClass());

        } finally {
            sc.close();
        }

    }

}

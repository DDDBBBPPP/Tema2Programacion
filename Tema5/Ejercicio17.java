package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int altura;
        char car;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduzca la altura: ");
            altura = sc.nextInt();
            sc.nextLine();
            System.out.print("Introduzca el caracter deseado");
            car = sc.nextLine().charAt(0);

            if (altura <= 0) {
                System.out.println("Introduzca un número superior a 0 para que la altura tenga sentido.");

            } else {
                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= altura - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        if(i<=2){
                            System.out.println(car + " ");
                        }

                    }
                    System.out.println("");
                }

            }

        } catch (InputMismatchException e) {
            System.out.print("Introduzca un número entero positivo.");
        } finally {
            sc.close();
        }
    }

}

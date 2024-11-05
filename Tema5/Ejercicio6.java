package Tema5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String cadena;
        int num;
        int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        cadena = sc.nextLine();
        num = Integer.parseInt(cadena);
        cantidad = cadena.length();
        System.out.println(num + " tiene " + cantidad + " dígito/s.");
        sc.close();
    }
}

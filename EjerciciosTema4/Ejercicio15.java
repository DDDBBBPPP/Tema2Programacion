package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int num;
        String dado;
        char caracter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        dado = sc.nextLine();
        num = dado.length();
        caracter = dado.charAt(num - 1);
        System.out.println("El último dígito del número introducido es: " + caracter );
        sc.close();
    }
}

package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        String escrito;
        int numero;
        int cantidad;
        char caracter1;
        char caracter2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero(5 cifras como máximo): ");
        escrito = sc.nextLine();
        numero = Integer.parseInt(escrito);
        if(numero>=0 && numero<100000){
            cantidad = escrito.length();
            caracter1 = escrito.charAt(0);
            caracter2 = escrito.charAt(cantidad - 1);
            if(caracter1==caracter2){
                System.out.println("El número introducido es capicúa.");
            }else{
                System.out.println("El número introducido no es capicúa.");

            }
        }else{
            System.out.println("El número introducido no es válido.");
        }

        sc.close();
    }
}
 
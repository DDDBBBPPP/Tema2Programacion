package tema7arrays;

import java.util.Scanner;


//Pedimos números y los mostramos del revés.
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla Intro despues de introducir cada número.");

        do {
            numeros[contador] = sc.nextInt();
            contador++;
        } while (contador < 10);

        System.out.println("Los números introducidos, al revés, son los siguientes:");

        for(contador = 9; contador>=0;contador--){
            System.out.print(numeros[contador] + ", ");
        }

        sc.close();
    }
}

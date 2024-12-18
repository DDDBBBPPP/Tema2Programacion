package tema7arrays;

import java.util.Scanner;

public class Ejercicio9ParImpar {
    //Pedir 8 numeros y decir si son pares o impares.
    public static void main(String[] args) {
        
        int i;
        int[] num = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca 8 números enteros, pulse");
        System.out.println(" INTRO después de cada número:");
        
        for(i=0;i<8;i++){
            num[i] = sc.nextInt();
        }
        System.out.println();
        
        for(i=0;i<8;i++){
            System.out.print(num[i] + " ");
            System.out.println((num[i]%2==0)?"par":"impar");
        }
    }
}

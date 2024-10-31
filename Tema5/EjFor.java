package Tema5;

import java.util.Scanner;

public class EjFor {
    public static void main(String[] args) {
        
        //Leer edad y muestre todos los años que ha cumplido
        // Ejemplo: Introduce tu edad: 5
        // 1 2 3 4 5
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        for(int i = 1; i<=edad;i++){
            System.out.print(i + " ");
        }
        sc.close();
    }
}

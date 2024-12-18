package tema7arrays;

import java.util.Scanner;

public class Ejercicio6RotarNumeros {
//Mover números a la derecha.
    public static void main(String[] args) {
        int i;
        int[] numeros = new int[15];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Vaya introduciendo números ");
        System.out.println("y pulsando INTRO:");
        // Al array se le ponen los datos
        for(i = 0;i<15;i++){
            numeros[i] = sc.nextInt();
        }
        // Primer bloque mostrado.
        System.out.println("Array original:");

        //Primera línea
        for(i = 0;i<15;i++){
            System.out.printf("|%3d ",i );
        }
        System.out.println("|");

        for(i = 0;i<15;i++){
            System.out.printf("-----",i );
        }
        
        System.out.println("-");

        for(i = 0;i<15;i++){
            System.out.printf("|%3d ",numeros[i] );
        }

        System.out.println("|");

        System.out.println("");

        //Aquí empezaré el segundo bloque.
        System.out.println("Array rotado a la derecha una posición:");

        for(i = 0;i<15;i++){
            System.out.printf("|%3d ",i );
        }
        System.out.println("|");

        for(i = 0;i<15;i++){
            System.out.printf("-----",i );
        }
        
        System.out.println("-");

        for(i = 0;i<15;i++){
            System.out.printf("|%3d ",(i==0)?numeros[14]:numeros[i-1]);
        }

        System.out.println("|");


        sc.close();
    }
}

package Tema5;

import java.util.Scanner;

public class Ejercicio32DibujarX {
    public static void main(String[] args) {
        int altura;
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la x: ");
        altura = sc.nextInt();
        if((altura>=3) && (altura%2!=0)){

            for(i = 1; i<=altura;i++){
                for(j=1;j<=altura;j++){
                    if((j==i) || (j == altura - i + 1)){
                        System.out.print("x");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println("");
            }



        }
        sc.close();
    }
}

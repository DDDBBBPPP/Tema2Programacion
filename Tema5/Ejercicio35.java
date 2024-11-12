package Tema5;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        int altura;
        int i;
        int j;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura, minimo 3");
        altura = sc.nextInt();
        if(altura<3){
            System.out.println("Vuelve a intentarlo, minimo altura 3.");
        }else{
            for(i =1; i<=altura;i++){
                for(j=1;j<=altura;j++){
                    System.out.print("*");
                    
                }
                for(){

                }
                System.out.println("");
            }
        }
    }
}

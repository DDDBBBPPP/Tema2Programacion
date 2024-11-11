package Tema5;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        int altura;
        int decremento = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura: ");
        altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<= (i*2)-1;j++){
                if(j<=i){
                    System.out.print(j);
                    decremento = j;
                }else{
                    decremento--;
                    System.out.print(decremento);
                }
                }
                System.out.println("");
            }

            sc.close();
            
        }

        

    }



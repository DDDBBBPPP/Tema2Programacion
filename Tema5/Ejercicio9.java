package Tema5;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int num = 1;
        int n;
        int total = 0;
        int ant = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de valores Fibonacci que quieres: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i <= 1) {
                System.out.print("0");

            } else if (i <= 2) {
                System.out.print("1");
            } else {

                total = num + ant;
                System.out.print(total);
                ant = num;
                num = total;
            }
            if(i<n){
                System.out.print(", ");
            }
        }
        sc.close();
    }

}

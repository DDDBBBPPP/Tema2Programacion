package Tema5;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        int num;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero a hacer factorial: ");
        num = sc.nextInt();
            for (; num >= 1; num--) {
                fact = num * fact;

            }
            System.out.println(fact);
        sc.close();
    }
}

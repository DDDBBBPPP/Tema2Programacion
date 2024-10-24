package EjerciciosTema3;

import java.util.Scanner;

public class Ej4Tema4 {
    public static void main(String[] args) {
            double x;
            double y;
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduzca el primer número: ");
            x = sc.nextDouble();

            System.out.print("Introduzca el primer número: ");
            y = sc.nextDouble();

            System.out.printf("x + y = %.1f\n", x + y);
            System.out.printf("x - y = %.1f\n", x - y);
            System.out.printf("x * y = %.1f\n", x * y);
            System.out.printf("x / y = %f\n", x / y);
            sc.close();
    }
}

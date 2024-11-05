package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        char car;
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Pinta una pirámide.");

        System.out.print("Introduzca el carácter de relleno: ");
        car = sc.nextLine().charAt(0);
        System.out.println("Elija un tipo de pirámide.");
        System.out.println("1. Vertice arriba");
        System.out.println("2. Vertice abajo");
        System.out.println("3. Vertice izquierda");
        System.out.println("4. Vertice derecha");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("  " + car);
                System.out.println(" " + car + car + car);
                System.out.println("" + car + car + car + car + car);
                break;
            case 2:
                System.out.println("" + car + car + car + car + car);
                System.out.println(" " + car + car + car);
                System.out.println("  " + car);

                break;
            case 3:
            System.out.println("  " + car);
            System.out.println(" " + car + car + car);
            System.out.println("" + car + car + car + car + car);

                break;
            case 4:

                break;
            default:
                System.out.println("Introduzca un número válido.");
        }
        sc.close();
    }
}

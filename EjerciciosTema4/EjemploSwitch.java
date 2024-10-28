package EjerciciosTema4;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el día de la semana: ");

        switch (sc.nextInt()) {
            case 1, 2, 3, 4, 5:
                System.out.print("Es un dia entre semana.");

                break;
            case 6:
            case 7: // las dos formas  valen para simplificar.
                System.out.print("Es fin de semana.");

            default:
                System.out.println("** Error: no se corresponde con ningún día de semana.");
                break; // se puede poner el case o no.
        }

        sc.close();
    }
}

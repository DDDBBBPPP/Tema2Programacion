package Tema5;

import java.util.Scanner;

public class Ejercicio33Capicua {

    public static void main(String[] args) {
        long numero;
        long inverso = 0;
        long numAux;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu número ");
        numero = sc.nextInt();
        numAux =  numero;
        while(numero>0){
            inverso = inverso*10 + (numero%10);
            numero = numero/10;
            // o uso resto, resto = numero%10 y después
            // inverso = inverso*10 + resto.

        }
        // Mostramos si el número es capicua
        if( inverso==numAux){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua.");
        }
       /*  // Otra manera con el ternario
        System.out.printf("El %d %s capicua\n", numAux,(numAux==inverso)?"ES":"NO ES");
 */

        sc.close();

    }

}

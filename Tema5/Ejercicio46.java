package Tema5;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        int numIntroducido = -1;
        boolean esPrimo = false;
        int contador = 2;
        int contadorGeneral = 0;
        int maximo = -1;
        int minimo = -1;
        float acumulacion = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca números enteros positivos: ");
        System.out.println("Para terminar, introduzca un número primo.");

        do {
            numIntroducido = sc.nextInt();
            if (numIntroducido >= 0) {
                while (contador <= (numIntroducido / 2) && (numIntroducido % contador) != 0) {
                    contador++;
                }
                if (contador > (numIntroducido/2)) {
                    esPrimo = true;
                } else {
                    if (esPrimo == false) {
                        contadorGeneral += 1;
                        if (contadorGeneral == 1) {
                            maximo = numIntroducido;
                            minimo = numIntroducido;
                        } else {
                            if (numIntroducido > maximo) {
                                maximo = numIntroducido;
                            }
                            if (numIntroducido < minimo) {
                                minimo = numIntroducido;
                            }
                        }
                        acumulacion += numIntroducido;
                    }
                }

                contador = 2;
            }

        } while (esPrimo == false && numIntroducido >= 0);

        acumulacion = acumulacion / contadorGeneral;
        System.out.println("Ha introducido " + contadorGeneral + " números no primos.");
        if(maximo<0 || minimo<0){
            System.out.println("No hay ni máximos ni mínimos.");
        }else{

            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
        }
        if(Float.isNaN(acumulacion)){

            System.out.println("La media no tiene solución al no introducir numeros no primos.");
 
    }else{
        System.out.println("Media: " + acumulacion);
    }
        sc.close();
    }
}

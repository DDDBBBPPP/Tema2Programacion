package tema7arrays;

import java.util.Scanner;

public class Ejercicio7CambiarNumero {

    public static final int CANTIDAD = 100;
    //Cambiar el número que elijan por otro.
    public static void main(String[] args) {
        int i;
        int repetido;
        int sustituido;
        int[] num = new int[CANTIDAD];
        Scanner sc = new Scanner(System.in);

        //Relleno el array y lo muestro
        for(i = 0; i<CANTIDAD;i++){
            num[i] = (int)(Math.random()*21);
            System.out.print(num[i] + "  ");
        }
        System.out.println();
        System.out.println();

        //Pido el cambio
        System.out.print("Introduzca un valor de los que se ha mostrado: ");
        repetido = sc.nextInt();
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        sustituido = sc.nextInt();
        System.out.println();

        //Pinto el array modificado
        for(i = 0; i<CANTIDAD;i++){
            System.out.print((num[i]==repetido)?"\"" + sustituido + "\"  ":num[i] + "  ");
        }


    }       
}

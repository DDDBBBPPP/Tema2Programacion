package tema7arrays;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Pide 10 numeros y los muestre diciendo cual es el
        //máximo y el mínimo al lado de el.
        int maximo = 0;
        int minimo = 0;
        int[] numero = new int[10];
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vaya introduciendo números y pulsando intro:");

        while(cont<10){
            numero[cont] = sc.nextInt();
            if(cont==0){
                maximo = numero[cont];
                minimo = numero[cont];

            }else{
                if(numero[cont]>maximo){
                    maximo = numero[cont];
            }
            if(numero[cont]<minimo){
                minimo = numero[cont];
        }
        }
        cont++;
    }

    for(cont=0;cont<10;cont++){
        System.out.print(numero[cont]);
        System.out.print((numero[cont]==maximo)?" máximo": "");
        System.out.print((numero[cont]==minimo)?" mínimo": "");
        System.out.println("");

        sc.close();
    }
}
}

package Tema5;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int num;
        String cadena;
        String cadenaInvertida = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número para darle la vuelta: ");
        num = sc.nextInt();
        cadena = Integer.toString(num);

        for(int i = 0; i<cadena.length();i++){
            cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
            
        }
        System.out.println(cadenaInvertida);
        sc.close();

    }
}

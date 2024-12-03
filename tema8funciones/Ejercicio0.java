package tema8funciones;

import java.util.Scanner;

public class Ejercicio0 {
// NO LO HE HECHO
    public static int leerValor(){
        int numero;
        boolean ok = false;
        Scanner sc = new Scanner(System.in);

        do{
            numero = sc.nextInt();
            ok = (numero > 2);
            if(!ok){
                System.out.println("Lo siento, el valor mínimo es 2");
                System.out.print("Introduzca un nuevo valor: ");
            }

        }while(!ok);

        sc.close();
        return numero;
    }
}

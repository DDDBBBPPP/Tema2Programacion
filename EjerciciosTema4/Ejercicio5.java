package EjerciciosTema4;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static final double GRAVEDAD = 9.81f;
    public static void main(String[] args) {

        double h;
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
       
        System.out.println("Cálculo del tiempo de caída de un objeto");
        System.out.print("Introduce la altura (en metros) desde la que cae el objetivo: ");
        h = sc.nextFloat();
        System.out.printf("El objeto tarda %.2f segundos.", Math.sqrt((2*h)/GRAVEDAD)) ;
        sc.close();
    }
}

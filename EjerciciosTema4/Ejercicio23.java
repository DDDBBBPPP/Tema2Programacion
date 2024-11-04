package EjerciciosTema4;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        int altura;
        int anchura;
        float calculo;
        String bordado;
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Introduzca la altura de la bandera en cms: ");
        altura = sc.nextFloat();
        System.out.print("Ahora introduzca la anchura: ");
        anchura = sc.nextFloat();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        bordado = sc.nextLine();
        if(altura <=0 || anchura<=0 || bordado != "s" || bordado != "n"){
            System.out.println("Introduce datos válidos.");
        }else{
            calculo
            System.out.printf("Bandera de %d cm cuadrados: %.2f $\n", altura*anchura,  );

        }
        sc.close();
    }
}

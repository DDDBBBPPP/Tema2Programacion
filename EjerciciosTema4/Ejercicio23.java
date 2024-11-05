package EjerciciosTema4;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        float altura;
        float anchura;
        float calculo;
        float escudo = 2.5f;
        String bordado;
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Introduzca la altura de la bandera en cms: ");
        altura = sc.nextFloat();
        System.out.print("Ahora introduzca la anchura: ");
        anchura = sc.nextFloat();
        sc.nextLine();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        bordado = sc.nextLine();
        if(altura <=0 || anchura<=0 || !bordado.equals("s") && !bordado.equals("n")){
            System.out.println("Introduce datos válidos.");
        }else{

            calculo = altura*anchura/100;
            System.out.printf("Bandera de %05.0f cm %-13s %7.2f $\n",  altura*anchura,"cuadrados:", calculo );
            if(bordado.equals("s")){
                calculo = calculo + escudo + 3.25f;
                System.out.printf("%-33s %7.2f $\n", "Con escudo:", escudo);
            }else{
                calculo = calculo + 3.25f;
                System.out.printf("%-33s %7.2f $\n", "Sin escudo:", 0.0f);
            }
            System.out.printf("%-33s %7.2f $\n","Gastos de envío:",  3.25);
            System.out.printf("%-33s %7.2f $\n", "Total:",calculo );


        }
        sc.close();
    }
}

package EjerciciosTema4;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        
        float nota;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Dime la nota de tu examen");
        nota = sc.nextFloat();

        if(nota<0){
            System.out.println("Inténtalo de nuevo.");
        } else if(nota>=5){
            System.out.println("Enhorabuena has aprobado!");
        }else{
            System.out.println("Suspendiste! :(.");
        }
        System.out.println((nota>=5)?"Has aprobado":"Suspendiste!");
        sc.close();
    }
}
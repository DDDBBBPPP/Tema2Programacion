package EjerciciosTema3;
import java.util.Scanner;
import java.util.Locale;
public class Ej9Tema3 {
    private static final double PI = 3.14159265359;
    public static void main(String[] args) {
        
        double altura;
        double radio;
        double volumen;
        // ESTO SI DA ERROR POR EL DOUBLE NO SE QUE
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Volumen de un cono");
        System.out.println("------------------");
        System.out.print("Introduzca la altura en cm: ");
        altura = sc.nextDouble();

        System.out.print("Introduzca el radio en cm: ");
        radio = sc.nextDouble();

        volumen = (1.0/3)* radio*radio*PI;

        System.out.printf("El volumen del cono es de %.11f\u00B3\n", volumen);
        sc.close();
    }
}

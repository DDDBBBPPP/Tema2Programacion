package EjerciciosTema3;

public class Ej6Tema3 {
    public static void main(String[] args) {
        float base;
        float altura;
        float area;
        
       System.out.println("Área de triángulo\n--------------------");
       System.out.print("Introduzca la longitud de la base (cm)");
       base = Float.parseFloat(System.console().readLine());
       System.out.println("Introduzca la altura(cm)");
       altura = Float.parseFloat(System.console().readLine());
       area = base * (altura/2);
       System.out.printf("El área del triángulo es %.2f cm\u00B2\n", area);
    }
}

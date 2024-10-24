package EjerciciosTema3;

public class Ej1Tema3 {
    public static void main(String[] args) {

        int num1;
        int num2;
        String linea;

        System.out.println("Este programa multiplica dos números enteros");
        System.out.println("Por favor, introduzca el primer número: ");

        linea = System.console().readLine();
        num1 = Integer.parseInt(linea);

        System.out.println("Por favor, introduzca el segundo número: ");

        num2 = Integer.parseInt(System.console().readLine());

        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);

    }
}

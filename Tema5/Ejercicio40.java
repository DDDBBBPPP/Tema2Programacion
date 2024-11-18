package Tema5;

public class Ejercicio40 {
    public static void main(String[] args) {

        int numA;
        int numB;
        int numero;
        int posicion;
        int resto;
        int invertido = 0;
        
        System.out.print("Introduce un numero entero positivo");
        numero = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce la posicion de partir el numero");
        posicion = Integer.parseInt(System.console().readLine());

        while(numero>0){
            resto = numero%10;
            invertido = (invertido*10) + resto;
            numero = numero/10;
        }

        System.out.printf("Los numeros partidos son el %d y el %d", numA, numB);
    }
}

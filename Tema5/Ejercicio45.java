package Tema5;

public class Ejercicio45 {
    public static void main(String[] args) {
        int digito;
        long numero;
        long temporal;

        System.out.print("Introduzca un numero entero: ");
        numero = Long.parseLong(System.console().readLine());

        // mostrar los digitos que aparecen
        System.out.print("Digitos que aparecen en el número. ");
        for (digito = 0; digito <= 9; digito++) {

            temporal = numero;

        }
        if (temporal > 0) {
            System.out.print(digito + " ");
        }
    }
    // mostrar los digitos que no aparecen
    System.out.println("Digitos que no aparecen en el número. ");

    }

    public static boolean buscarDigito(long numero, int digito){
        while((numero>0) && digito!=(numero%10)){
          numero = numero /=10;

          return ( numero > 0);
    }
}

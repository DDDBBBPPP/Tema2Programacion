package Tema5;

public class Ejercicio6Digitos {
    public static void main(String[] args) {
        int num;
        int auxiliar;
/*         int resto; */
        int digitos = 0;
        System.out.print("Introduzca el numero entero: ");
        num = Integer.parseInt(System.console().readLine());
        
        auxiliar = num;
        while(auxiliar > 0){
       /*  resto = auxiliar % 10; // esto no vale para nada pero se puede usar para otro ejercicio */
        auxiliar = auxiliar / 10;
        digitos++;
        }


        System.out.println("El numero tiene " + digitos + " digitos.");
    }
}

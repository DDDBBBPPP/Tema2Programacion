package Tema5;

public class Ejercicio40 {
    public static void main(String[] args) {

        long numA = 0;
        long numB = 0;
        long numero;
        long posicion;
        long invertido = 0;
        long numAux;
        
        System.out.print("Introduce un numero entero positivo: ");
        numero = Long.parseLong(System.console().readLine());
        numAux = numero;
        System.out.print("Introduce la posicion de partir el numero: ");
        posicion = Long.parseLong(System.console().readLine());
//ESTO SE PUEDE UTILIZAR PARA EL 22, SI TE FIJAS  ESTO LE DA LA VUELTA.
        while(numero>0){
            invertido = (invertido*10) + (numero%10);
            numero = numero/10;
        }
        //Ahora podria darle la vuelta otra vez y contar hasta cuando guardo.
        // Primer numero
        for(;posicion>=1;posicion--){
            numA = (numA*10) + invertido%10;
            invertido = invertido/10;
        }

        //Segundo numero
        while(invertido>0){
            numB = (numB*10) + invertido%10;
            invertido = invertido/10;
        }


        System.out.printf("El numero %d se transforma en %d\n", numAux, invertido);

        System.out.printf("Los numeros partidos son el %d y el %d", numA, numB);

    }
}

package Tema5;

public class Ejercicio38 {

    public static void main(String[] args) {

        long num;
        long digito;
        long guardado;
        int contadorPar = 0;
        int contadorImpar = 0;
        
        System.out.print("Introduce un número: ");
        num = Long.parseLong(System.console().readLine());
        guardado = num;

        if(num>=0){
            while(num>0){
              digito = num%10;
              num = num/10;
              if( (digito%2) == 0){
                contadorPar +=1;
              }else{
                contadorImpar +=1;
              }
            }
        }else{
            System.out.println("Introduzca un número entero POSITIVO.");
        }

        System.out.printf("El numero %d contiene %d digitos pares y %d digitos impares\n", guardado, contadorPar, contadorImpar);

    }

}

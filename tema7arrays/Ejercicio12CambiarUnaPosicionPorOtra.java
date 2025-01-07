package tema7arrays;

public class Ejercicio12CambiarUnaPosicionPorOtra {
    // Cambiar un número de posición por otro. y rotar en consecuencia el array.

    public static void main(String[] args) {
        int posIni;
        int posFin;
        int aux;
        int i;
        int[] numeros = new int[10];
        int rango = 21;

        System.out.println("Array original: ");

        FuncionesArray.rellenarRandom(numeros, rango);

        FuncionesArray.mostrarArrayInt(numeros);
        // Nos dicen las posiciones

        System.out.println("Dime la posicion inicial: ");
        posIni = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la posición final: ");
        posFin = Integer.parseInt(System.console().readLine());
        // Otro array

        System.out.println("Array modificado: ");

        // Cambiamos la primera parte
        // Guardamos el posIni en la aux.
        aux = numeros[posIni];
        for (i = posIni; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = numeros[numeros.length - 1];

        // La segunda parte.
        for (i = numeros.length - 1; i > posFin; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[posFin] = aux;


        //Mostramos el array
        FuncionesArray.mostrarArrayInt(numeros);
    }
}

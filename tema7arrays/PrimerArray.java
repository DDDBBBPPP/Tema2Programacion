package tema7arrays;

public class PrimerArray {

    private static final int MAXIMO = 100;
    public static void main(String[] args) {

    /*  float suma;
        int[] numeros; //Definimos un array de números enteros que se llama números
        numeros = new int[3]; // Reserva memoria para 3 valores de tipo entero.
        int[] datos = {0,1,2,3,4,5,6,7,8,9};// Defino, creo e inicializo en una línea. Y se pone con llaves.
        
        // En los arrays tienes que definir al principio cuantos espacios tiene.

        numeros[0] = 82; // Guardamos en la celda 0 (la primera) el valor 82.
        numeros[1] = 33;
        numeros[2] = -64; // Guardamos en la celda 2, la tercera.
        System.out.println("Los valores del array son: ");
        System.out.printf("%d, %d, %d\n", numeros[0], numeros[1], numeros[2]);
        //numeros es una variable de tipo array de enteros
        //cada una de sus celdas es una variable de tipo entero.

        suma = numeros[0] + numeros[1] +  numeros[2];
        System.out.printf("La media de la suma es: %f", suma/3); */
        int[] numeros;
        numeros = new int[MAXIMO];
        //int[] numeros = new int[MAXIMO];

        for(int i = 0; i < MAXIMO; i++){
            numeros[i] = (int)(Math.random()*20);
            System.out.print(numeros[i] + " ");
        }

    }
}

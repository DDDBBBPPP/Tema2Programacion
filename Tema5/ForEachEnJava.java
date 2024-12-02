package Tema5;

public class ForEachEnJava {
    public static void main(String[] args) {

        int[] numeros = new int[31];
        int[][] bidimensional = new int[12][31];

        // Esto recorre todo el array unidimensional.
        for (int item : numeros) {
            System.out.print(item + " ");

        }

        /*
         * // Si pones foreach te hace esto del tirón
         * for (int i : numeros) {
         * 
         * }
         */
        // Para recorrer bidimensionales
        for (int[] fila : bidimensional) {
            for (int item : fila) {
                System.out.printf("%d ", item);
            }
        }
    }
}

package tema7arrays;

public class Ejercicio34Diagonal {

    public static void main(String[] args) {

        int[][] matriz = new int[9][9];
        int i = 8;
        int j = 0;
        int maximo = 100;
        int minimo = 901;
        int media = 0;
        FunBid.rellenarRandom(matriz, 500, 901);
        FunBid.mostrarArray(matriz);
        System.out.print("Diagonal abajo izquierda: ");

        while (dentro(i, j)) {
            if (maximo < matriz[i][j]) {
                maximo = matriz[i][j];
            }
            if (minimo > matriz[i][j]) {
                minimo = matriz[i][j];
            }
            System.out.print((i==0)? matriz[i][j] + "\n":matriz[i][j]+ " ");
            media += matriz[i][j];
            i--;
            j++;
        }

        

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + (media / matriz.length));

    }

    public static boolean dentro(int i, int j) {
        return ((i < 9) && (i >= 0) && (j < 9) && (j >= 0));
    }

}

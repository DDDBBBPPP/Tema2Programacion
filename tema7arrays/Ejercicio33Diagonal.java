package tema7arrays;

public class Ejercicio33Diagonal {
    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];   
        int i = 0;
        int j = 0;
        int maximo = 100;
        int minimo = 301;
        int media = 0;
        FunBid.rellenarRandom(matriz, 200, 301);
        FunBid.mostrarArray(matriz);

        while(dentro(i, j)){
            if(maximo< matriz[i][j]){
                maximo = matriz[i][j];
            }
            if(minimo > matriz[i][j]){
                minimo = matriz[i][j];
            }
            media += matriz[i][j];
            i++;
            j++;
        }


        System.out.print("Diagonal desde arriba izquierda: ");

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + (media/matriz.length));

    }
    public static boolean dentro(int i, int j){
        return ((i<10) && (i>=0) && (j<10) && (j>=0));
    }

}

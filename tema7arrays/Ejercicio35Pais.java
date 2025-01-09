package tema7arrays;

public class Ejercicio35Pais {
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] matriz = new int[4][10];
        int i;
        int j;
        int minimo = 211;
        int maximo = 0;
        int media = 0;

        FunBid.rellenarRandom(matriz, 140, 211);
        FunBid.mostrarArray(matriz);
        System.out.println("\t\t\t\t\t\t       MED MIN MAX");

        for(i = 0; i<matriz.length;i++){

            System.out.printf("%11s: ", pais[i]);
            for(j = 0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
                if(maximo<matriz[i][j]){maximo = matriz[i][j];}
                if(minimo>matriz[i][j]){minimo = matriz[i][j];}
                media += matriz[i][j];
            }
            System.out.printf("| %d %d %d", media/10,minimo,maximo);
            System.out.println();
            media = 0;
            maximo = 0;
            minimo = 211;
        }
        System.out.println();
    }
}   

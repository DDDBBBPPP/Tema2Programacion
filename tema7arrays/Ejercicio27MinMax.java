package tema7arrays;

public class Ejercicio27MinMax {
    public static void main(String[] args) {
        int[][] matriz = new int[6][10];
        int i;
        int j;
        int maximo = 0;
        int minimo = 1000;
        int filaMax = 0;
        int filaMin = 0;
        int columMax = 0;
        int columMin = 0;

        FunBid.rellenarRandom(matriz, 0, 1001);
        //Lo pintamos
        System.out.printf("   ");
        for(i = 0;i<=9;i++){
            System.out.printf("%6d", i);
        }
        
        System.out.println();
        //Pintamos el resto de la tabla
        for(i = 0;i<matriz.length;i++){
            System.out.printf("%d |",i);

            for(j=0;j<matriz[i].length;j++){
                //Comprobacion de maximos y minimos
                if(matriz[i][j]>maximo){
                    maximo = matriz[i][j];
                    filaMax = i;
                    columMax = j;
                }
                if(matriz[i][j]<minimo){
                    minimo = matriz[i][j];
                    filaMin = i;
                    columMin = j;
                }
                //Seguimos pintando
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }
        //Decimos los maximos y minimos
        System.out.printf("El maximo es %d y está en la fila %d y columna %d\n", maximo,filaMax,columMax );
        System.out.printf("El minimo es %d y está en la fila %d y columna %d\n", minimo,filaMin,columMin );

    }
}
// UNA MUY BUENA MANERA DE AHORRARTE VARIABLES CON ESTE TRUCO
/* public class Ejercicio27MinMax {
    public static void main(String[] args) {
        int[][] matriz = new int[6][10];
        int[] posicionMaximo = {0, 0}; // Para almacenar fila y columna del máximo
        int[] posicionMinimo = {0, 0}; // Para almacenar fila y columna del mínimo

        FunBid.rellenarRandom(matriz, 0, 1001);

        // Inicializamos el máximo y el mínimo con el primer elemento de la matriz
        int maximo = matriz[0][0];
        int minimo = matriz[0][0];

        // Imprimir encabezado
        System.out.printf("   ");
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%6d", i);
        }
        System.out.println();

        // Recorrer la matriz y calcular máximo, mínimo y posiciones
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%d |", i);
            for (int j = 0; j < matriz[i].length; j++) {
                // Comprobar máximo
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    posicionMaximo[0] = i;
                    posicionMaximo[1] = j;
                }
                // Comprobar mínimo
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                    posicionMinimo[0] = i;
                    posicionMinimo[1] = j;
                }
                // Imprimir el valor actual
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }

        // Decir máximos y mínimos
        System.out.printf("El máximo es %d y está en la fila %d y columna %d\n", 
                          maximo, posicionMaximo[0], posicionMaximo[1]);
        System.out.printf("El mínimo es %d y está en la fila %d y columna %d\n", 
                          minimo, posicionMinimo[0], posicionMinimo[1]);
    }
}
 */
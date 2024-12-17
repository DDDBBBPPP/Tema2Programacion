package tema7arrays;

public class ArraysBidimensionales {
    private static final int DIAS = 31; // Dias de un mes
    private static final int MESES = 12;

    public static void main(String[] args) {

        double[][] temperaturas = new double[MESES][DIAS];

      //  int[][] bidimensional = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < MESES; i++) {

            for (int j = 0; j < DIAS; j++) {
                temperaturas [i][j] = Math.random()*45;
            }
        }
        mostarMes(temperaturas, 11);

    }

    /**
     * La función muestra las temperaturas de un mes dado.
     * (1 enero, 2, febrero, 3, marzo)
     * 
     * @param datos
     * @param mes
     */
    /* public static void mostrarMes(double[] datos, int mes) {

        int ini = (mes - 1) * 31;
        int fin = ini + 31;

        for (; ini < fin; ini++) {
            System.out.print(datos[ini] + " ");
        }
    } */
/**
 * 
 * @param datos
 * @param mes
 */
    public static void mostarMes(double[][] datos, int mes){
        for(int i = 0; i <DIAS ; i++){
            System.out.printf("%.3f",datos[mes-1][i]);

        }
    }

    
}

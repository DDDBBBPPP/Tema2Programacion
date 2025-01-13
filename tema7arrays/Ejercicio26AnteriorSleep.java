package tema7arrays;

public class Ejercicio26AnteriorSleep {
    public static final int FILAS = 4;
    public static final int COLUMNAS = 5;
    public static void main(String[] args) {
        
        int[][] matriz = new int[FILAS][COLUMNAS];
        int[] filas = new int[FILAS];
        int[] columnas = new int[COLUMNAS];
        int i;
        int j;
        int suma = 0;
    
        
        //Rellenamos el array
        for(i = 0; i<matriz.length;i++){
            for(j = 0; j<matriz[i].length;j++){
                System.out.println("Fila " + i + ", columna " + j + ": ");
                matriz[i][j] = (int)((Math.random()*(1000-100))+100);
            }
        }
        // Se rellenan los arrays de las sumas de filas y la suma total.
        for(i = 0; i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){

                filas[i] += matriz[i][j];
                columnas[j] += matriz[i][j];
                suma += matriz[i][j];
            }
        }
        System.out.println();
        // Mostrar el array
        for(i = 0;i<matriz.length;i++){
            for(j = 0; j<matriz[i].length;j++){
                System.out.printf("%8d", matriz[i][j]);
            }
            // Aqui empieza
            try{
                Thread.sleep(	500);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.printf("|%8d\n", filas[i]);
        }

        System.out.println("--------------------------------------------------------");
        try{
            Thread.sleep(	500);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        for(i = 0; i<COLUMNAS;i++){
            System.out.printf("%8d", columnas[i]);
        }
        try{
            Thread.sleep(	500);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.printf("|%8d\n", suma);

    }
}

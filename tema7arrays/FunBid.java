package tema7arrays;

public class FunBid {



    /**
     * 
     * @param numeros
     */
    public static void mostrarArray(int [][] numeros){

        for(int i = 0; i<numeros.length;i++){
            for(int j = 0; j<numeros[i].length;j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * 
     * @param numeros
     * @throws NumberFormatException
     */
    public static void leerArray(int[][] numeros) throws NumberFormatException{
        //Si es mas de una excepcion se pone throws Exception
        try{

            for(int i = 0; i<numeros.length;i++){
                for(int j = 0;j<numeros[i].length;j++){
                    numeros[i][j] = Integer.parseInt(System.console().readLine());
                }
            }
        }catch(NumberFormatException e){
            throw e; // Con esto gestionas las excepciones de funciones, y las lanzas al main.
            //
        }
    }


    public static void rellenarRandom(int[][] numeros, int min, int max){
        for(int i = 0; i<numeros.length;i++){
            for(int j = 0;j<numeros[i].length;j++){
                numeros[i][j] = (int)((Math.random()*(max-min))+min);
            }
        }
    }
}

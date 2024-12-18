package tema7arrays;

public class FuncionesArray {

/**
 * Para leer todos los arrays
 * @param numeros
 * @param cantidad
 */
    public static void leerArregloEntero(int[] numeros) throws NumberFormatException{
        //Si es mas de una excepcion se pone throws Exception
        try{

            for(int i = 0; i<numeros.length;i++){
                numeros[i] = Integer.parseInt(System.console().readLine());
            }
        }catch(NumberFormatException e){
            throw e; // Con esto gestionas las excepciones de funciones, y las lanzas al main.
            //
        }
    }
}

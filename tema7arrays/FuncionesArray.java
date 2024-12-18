package tema7arrays;

public class FuncionesArray {

/**
 * Para leer todos los arrays
 * @param numeros
 * @param cantidad
 */
    public static void leerArregloInt(int[] numeros) throws NumberFormatException{
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
/**
 * Mostrar array unidimensional con un espacio
 * @param numeros
 */
    public static void mostrarArrayInt(int[] numeros){

        for(int i = 0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
/**
 * Copiar un array entero pasando primero el array donde lo quiero tener.
 * @param num1
 * @param num2
 */
    public static void copiarArrayInt(int[] num1, int[] num2){

        for(int i = 0; i<num2.length;i++){

            num1[i] = num2[i];
        }
    }
/**
 * Separar entre pares e impares según te los encuentres.
 * @param numeros
 */
    public static void separarParImparArray(int[] numeros){
       int i = 0;
       int f= numeros.length - 1;
       int[] modificado = new int[numeros.length];

        for(int j=0;j<numeros.length;j++){
            
            if(numeros[j]%2==0){
                modificado[i] = numeros[j];
                i++;
            }else{
                modificado [f] = numeros[j];
                f--;
            }
        }
        //Copiamos el array para que quede en el mismo.
        copiarArrayInt(numeros, modificado);

    }

/**
 * Sacamos de un array una fraccion dando la posicion inicial y final originales.
 * @param numeros
 * @param p1
 * @param p2
 * @return
 */
    public static int[] miniArrayInt(int[] numeros, int p1, int p2){
        int i;
        int[] fraccion = new int[(p2 - p1) +1];

        for(i = 0;i<fraccion.length;i++){
            fraccion[i] = numeros[p1];
            p1++;
        }
        return fraccion;
    }

    /**
     * Ordenar los datos de un Array.
     * @param numeros
     */
    public static void ordenarArray(int[]numeros){

    }


/**
 * 
 * @param arrayCompleto
 * @param mini1
 * @param mini2
 */
    public static int[] juntarArray(int[] arrayCompleto, int[] mini1, int[] mini2){
        int i;
        arrayCompleto = new int[mini1.length + mini2.length];
        int f = mini1.length;

        for(i = 0;i<arrayCompleto.length;i++){
            if(i<mini1.length){
                arrayCompleto[i] = mini1[i]; 
            }else{
                arrayCompleto[i] = mini2[f];
                f++;
            }
        }

        return arrayCompleto;

    }




}

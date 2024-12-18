package tema7arrays;


public class Ejercicio11PrimosDelante {
//Poner los primos delante.
    public static void main(String[] args) {
        int i;
        int j;
        int[] original = new int[10];
        int[] modificado = new int[10];
        int contador = 0;

        System.out.println("Introduzca 10 números y pulse INTRO cada vez:");

        //Leemos los datos del array
        FuncionesArray.leerArregloInt(original);
        
        System.out.println("Array original:");
        //Pintamos la primera tabla
        //Primera fila
        for (i = 0; i <= 10; i++) {
            if(i==0){
                System.out.print(" Índice |");
            }else{
                System.out.printf("%4d |", i-1);
            }
            
        }
        System.out.println();
        //Segunda Fila
        for (i = 0; i <= 10; i++) {
            if(i==0){
                System.out.print(" Valor  |");
            }else{
                System.out.printf("%4d |", original[i-1]);
            }  
        }


        System.out.println();
        System.out.println();
        // Empezamos con los primos al principio
        System.out.println("Array con los primos al principio:");
        System.out.println();
        // Empezamos a rellenar de pares el array
        for (i = 0; i < 10; i++) {
            j=2;
            //Comprobamos los primos.
            while(j<original[i] && original[i]%j!=0){
                j++;
            }
            //Guardamos los primos al principio
            if(j>=original[i]){
                modificado[contador] = original[i];
                contador++;
            }
        }
        // Rellenamos el resto del array
        for (i = 0; i < 10; i++) {
            j=2;
            //Comprobamos los  no primos.
            while(j<original[i] && original[i]%j!=0){
                j++;
            }
            //Guardamos los no primos despues
            if(j<original[i]){
                modificado[contador] = original[i];
                contador++;
            }else{

            }
        }


        // Aquí se pinta la modificada
        //Primera fila
        for (i = 0; i <= 10; i++) {
            if(i==0){
                System.out.print(" Índice |");
            }else{
                System.out.printf("%4d |", i-1);
            }
            
        }
        System.out.println();
        //Segunda Fila
        for (i = 0; i <= 10; i++) {
            if(i==0){
                System.out.print(" Valor  |");
            }else{
                System.out.printf("%4d |", modificado[i-1]);
            }
            
        }
    }
}

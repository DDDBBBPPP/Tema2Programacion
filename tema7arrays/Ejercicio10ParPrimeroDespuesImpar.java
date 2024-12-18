package tema7arrays;

public class Ejercicio10ParPrimeroDespuesImpar {
    // Cambiar los numeros pares al primero y despues los pares.
    public static void main(String[] args) {
        int i;
        int[] original = new int[20];
        int[] modificado = new int[20];
        int contador = 0;

        System.out.println("Array original:");
        // Se rellena el array
        for (i = 0; i < 20; i++) {
            original[i] = (int) (Math.random() * 100);
            System.out.print(original[i] + " ");
        }
        System.out.println();
        // Empezamos con los pares al principio
        System.out.println("Array con los pares al principio:");

        // Empezamos a rellenar de pares el array



        /* CON EL FOR EACH
        CON EL FOR EACH ES CUANDO SE DECLARAN DENTRO DEL BUCLE.
        for(int item:original){
            if(item%2 == 0){
                modificado[contador] = item;
                contador++;
            }
        } */



        for (i = 0; i < 20; i++) {
            if (original[i] % 2 == 0) {
                modificado[contador] = original[i];
                contador++;
            }
        }
        // Rellenamos el resto del array
        for (i = 0; i < 20; i++) {
            if (original[i] % 2 != 0) {
                modificado[contador] = original[i];
                contador++;
            }
        }
        // Aquí se pinta la modificada
        for (i = 0; i < 20; i++) {
            System.out.print(modificado[i] + " ");
        }

        //2 Soluciones. La primera solucion con un mismo array y de un recorrido, con dos indices, y sin importar orden
        //Poner los pares al principio y los impares al final. indices i y f.
        

    }
}

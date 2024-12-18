package tema7arrays;

public class Ejercicio10ParImparUnaVuelta {

    public static void main(String[] args) {

        int i;
        int[] original = new int[20];

        System.out.println("Array original:");
        // Se rellena el array
        for (i = 0; i < 20; i++) {
            original[i] = (int) (Math.random() * 100);
            System.out.print(original[i] + " ");
        }
        System.out.println();
        System.out.println();

        FuncionesArray.separarParImparArray(original);

        //Lo mostramos
        System.out.println("Array modificado:");
        FuncionesArray.mostrarArrayInt(original);





        
    }
}

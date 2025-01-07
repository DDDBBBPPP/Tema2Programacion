package tema7arrays;

public class Ejercicio16Multiplo5o7 {
    public static void main(String[] args) {
        int i;
        int[] numeros = new int[20];
        boolean eleccion = false;

        FuncionesArray.rellenarRandom(numeros, 401);
        FuncionesArray.mostrarArrayInt(numeros);

        System.out.println("Qué numero quiere resaltar");
        System.out.println("1, multiplos de 5 y 2 multiplos de 7 ");
        // No controlamos si da otros valores, me da igual.
        eleccion = (Integer.parseInt(System.console().readLine()) == 1);
        // Lo mostramos segun la eleccion con los corchete
        for (i = 0; i < numeros.length; i++) {
            if (eleccion) {
                System.out.print((numeros[i] % 5 != 0) ? numeros[i] + " " : "[" + numeros[i] + "] ");
            } else {
                System.out.print((numeros[i] % 7 != 0) ? numeros[i] + " " : "[" + numeros[i] + "] ");
            }
        }

    }
}

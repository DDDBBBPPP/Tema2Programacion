package tema7arrays;

public class Ejercicio18Alternar {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] modificado = new int[10];
        int menores = 0, mayores = 0;

        // Llenar el array con números aleatorios entre 0 y 200
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 201);
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Contar menores y mayores para separar
        int[] menoresArray = new int[10];
        int[] mayoresArray = new int[10];

        for (int num : numeros) {
            if (num <= 100) {
                menoresArray[menores++] = num;
            } else {
                mayoresArray[mayores++] = num;
            }
        }

        // Alternar menores y mayores en el array modificado
        int i = 0, menorIndex = 0, mayorIndex = 0;

        while (i < modificado.length) {
            if (menorIndex < menores) {
                modificado[i++] = menoresArray[menorIndex++];
            }
            if (mayorIndex < mayores && i < modificado.length) {
                modificado[i++] = mayoresArray[mayorIndex++];
            }
        }

        // Mostrar el array resultante
        System.out.println("Array resultado:");
        for (int num : modificado) {
            System.out.print(num + " ");
        }
    }
}

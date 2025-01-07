package tema7arrays;

import java.util.Scanner;

public class Ejercicio15MesaRest {
    public static void main(String[] args) {
        // Sentar a la gente en mesas de máximo 4
        int[] numeros = new int[10];
        int i = 0;
        int opcion = 0;
        boolean asignar = false;
        boolean primera = false;
        Scanner sc = new Scanner(System.in);
        // Rellenamos el array
        FuncionesArray.rellenarRandom(numeros, 5);

        // Hacemos el menú

        do {
            // Aqui se muestran las mesas.
            System.out.println();
            System.out.printf("%-12s", "Mesa nº");
            for (i = 1; i < 11; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.printf("%-12s", "Ocupación");
            FuncionesArray.mostrarArrayInt(numeros);
            // Se pregunta
            System.out.print("¿Cuántos son? (Introduzca -1 para acabar) ");
            opcion = sc.nextInt();

            if ((opcion < -1) || opcion > 4) {
                System.out.println("Lo siento en estos momentos no nos queda sitio");
            } else if (opcion == -1) {
                System.out.println("Gracias. Hasta Pronto.");
            } else {
                // Primero vamos a recorrer el array para ver si hay 0s y le sumamos opcion. También pondremos una condicion cuando sepamos que ya no hay más 0s no pasar mas.
                i = 0;
                while(!asignar && !primera && i<numeros.length){
                    if(numeros[i]==0){
                        asignar = true;
                        numeros[i] = opcion;
                        System.out.println("Por favor, siéntese en la mesa " + (i + 1));
                    }
                    i++;
                }
                //Aqui comprobamos si hemos entrado en la condición
                if(!asignar){primera = true;}

                i=0;
                // Aqui para compartir mesa cuando ya no queden libres
                while(!asignar && i<numeros.length){
                    if((numeros[i] + opcion) < 5){
                        asignar = true;
                        numeros[i]+= opcion;
                        System.out.println("Tendrán que compartir mesa. En la " + (i + 1));
                    }
                    i++;
                }
                // aqui se dice si no queda sitio para esas personas en concreto, pero no se cierra pq quizas 1 si cabe.
                if(!asignar){
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                }
                asignar = false;
            }

        } while (opcion != (-1));

        sc.close();
    }
}

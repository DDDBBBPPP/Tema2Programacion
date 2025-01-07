package tema7arrays;

public class Ejercicio13MaximoOMinimo {
    public static void main(String[] args) {
        //RELLENAR ARRAY Y SEÑALAR MAXIMO O MINIMO.
        boolean min;
        int i;
        int maximo = 0;
        int minimo = 0;
        int[] numeros = new int[100];


        //Aqui sabemos cual es el maximo y minimo mientras rellenamos.
       for (i = 0; i < numeros.length;i++) {
            numeros[i] = (int) (Math.random() * 501);
            if(i==0){
                maximo = numeros[i];
                minimo = numeros[i];
            }else{
                if(maximo<numeros[i]){
                    maximo = numeros[i];
                }
                if(minimo>numeros[i]){
                    minimo = numeros[i];
                }
            }
        }

        System.out.println("Array original.");

        FuncionesArray.mostrarArrayInt(numeros);

        // Eleccion
        System.out.println("Dime 1 si quieres el minimo y 2 si quieres el máximo.");

        min = (Integer.parseInt(System.console().readLine()) == 1);

        for(i = 0; i<numeros.length;i++){

            if(min){
                System.out.print((minimo == numeros[i])? "**"+ numeros[i] + "** ": numeros[i] + " ");
            }else{
                System.out.print((maximo == numeros[i])? "**"+ numeros[i] + "** ": numeros[i] + " ");
            }
        }

    }
}

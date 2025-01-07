package tema7arrays;

public class Ejercicio10ParImparOrdenado {
    //Aquí usamos el algoritmo de separar rápido y lo ordenamos después.
    public static void main(String[] args) {
        
        int i;
        int j;
        int f;
        int[] fraccionPar;
        int[] fraccionImpar;
        int[] original = new int[20];
        int[] modificado = new int[20];

        System.out.println("Array original:");
        // Se rellena el array
        for (i = 0; i < 20; i++) {
            original[i] = (int) (Math.random() * 100);
            System.out.print(original[i] + " ");
        }
        System.out.println();

        i=0;
        f= original.length - 1;
       
        for(j=0;j<original.length;j++){
            
            if(original[j]%2==0){
                modificado[i] = original[j];
                i++;
            }else{
                modificado [f] = original[j];
                f--;
            }
        }

        //Ponemos los índices apuntando a donde deben.
        i--; // donde terminan los pares
        f++; // donte empiezan los impares
        //Copiamos el array para que quede en el mismo.
        FuncionesArray.copiarArrayInt(original, modificado);

        //Hacemos dos fracciones y las mostramos para ver como queda.
        fraccionPar = FuncionesArray.miniArrayInt(original, 0, i);
        System.out.println("Fraccion par: ");
        FuncionesArray.mostrarArrayInt(fraccionPar);

        fraccionImpar = FuncionesArray.miniArrayInt(original, f, original.length-1);
        System.out.println("Fraccion impar: ");
        FuncionesArray.mostrarArrayInt(fraccionImpar);

        //Ordenamos cada array
        FuncionesArray.ordenarArray(fraccionPar);
        System.out.println("Fraccion par: ");
        FuncionesArray.mostrarArrayInt(fraccionPar);
        FuncionesArray.ordenarArray(fraccionImpar);
        System.out.println("Fraccion impar: ");
        FuncionesArray.mostrarArrayInt(fraccionImpar);


        //Juntamos los arrays.
       /*  nuevo = new int[fraccionPar.length + fraccionImpar.length];//AL meterlo en la funcion necesita tener ya una longitud.
        nuevo = FuncionesArray.juntarArray(nuevo, fraccionPar, fraccionImpar);
        System.out.println("NUEVO NUEVO NUEVO");
        FuncionesArray.mostrarArrayInt(nuevo);
 */

        //Juntamos los arrays
        FuncionesArray.juntarArray(original, fraccionPar, fraccionImpar);
        
        
        //Lo mostramos
        System.out.println("Array modificado:");
        FuncionesArray.mostrarArrayInt(original);

    }
}

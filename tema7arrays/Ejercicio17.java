package tema7arrays;

public class Ejercicio17 {
    public static void main(String[] args) {
        int i;
        int[] numeros = new int[10];
        int elec;
        int aux;
        boolean coincide = false;

        FuncionesArray.rellenarRandom(numeros, 101);
        FuncionesArray.mostrarArrayInt(numeros);

        do{
            System.out.print("Introduce tu numero: ");
            elec = Integer.parseInt(System.console().readLine());
            // se comprueba si está el dígito.
            for(i = 0;i<numeros.length;i++){
                if(elec==numeros[i]){
                    coincide = true;
                }
            }
            if(coincide){
                //Si coincide habra que rotar hasta que este en el 0.
                while(elec!=numeros[0]){
                    aux = numeros[numeros.length-1];
                    for(i=numeros.length -1;i>0;i--){
                        numeros[i] = numeros[i-1];
                    }
                    numeros[0] = aux;
                }
                FuncionesArray.mostrarArrayInt(numeros);
            }else{
                System.out.println("Este número no se encuentra en el array.");
            }

        }while(!coincide);
        //aqui loo mostramos al final
    }
}

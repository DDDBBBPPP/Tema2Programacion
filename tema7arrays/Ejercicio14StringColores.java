package tema7arrays;

public class Ejercicio14StringColores {

    public static final int MAXIMO = 8;
    public static void main(String[] args) {
        //Poner en un array de Strings los colores al principio y en el orden que venian las palabras.
        int i;
        int k;
        boolean coincide = false;
        int j=0;
        int f=0;
        String[] pedida = new String[MAXIMO];
        String[] colorin = new String[MAXIMO];
        String[] resto = new String[MAXIMO];

        String[] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};


        System.out.println("Dame palabras y ve pulsando enter: ");
        //Rellenamos el array
        for(i = 0; i<pedida.length;i++){
            pedida[i] = System.console().readLine().toLowerCase();
        }

        //Lo mostramos
        System.out.println("Array original: ");
        FuncionesArray.mostrarArray(pedida);

        //Rellenamos los dos arrays
        for(i = 0;i<pedida.length;i++){
             for(k=0;k<colores.length;k++){
                if(pedida[i].equals(colores[k])){
                    coincide = true;
                }
             }
             if(coincide){
                colorin[j] = pedida[i];
                j++;
             }else{
                resto[f] = pedida[i];
                f++;
             }
             coincide = false;
        }

        //Juntamos el array en el original con los achicados, los achicados salen de la funcion
        FuncionesArray.juntarArrayString(pedida, FuncionesArray.miniArray(colorin,0, j-1),FuncionesArray.miniArray(resto,0, f-1));

        //Lo mostramos a ver que tal
        System.out.println("Array modificado: ");
        FuncionesArray.mostrarArray(pedida);
    }
}

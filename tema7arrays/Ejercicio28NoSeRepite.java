package tema7arrays;

public class Ejercicio28NoSeRepite {
    public static void main(String[] args) {
        int[][] matriz = new int[6][10];
        int[]   numeros = new int[60]; //La cantidad que hay de numeros en el otro array.
        int i;
        int j;
        int maximo = 0;
        int minimo = 1000;
        int filaMax = 0;
        int filaMin = 0;
        int columMax = 0;
        int columMin = 0;
        int k= 0;
        boolean unico = true;

        //Aquí vamos a hacer que no se repita.

        //Primero creamos un array lineal donde albergamos los numeros, asi se puede recorrer facil.
        for(i = 0;i<numeros.length;i++){
            do{
                unico = true;
                numeros[i] = (int)(Math.random()*1001);
                for(j=0;j<i;j++){
                    if(numeros[i]==numeros[j]){
                        unico = false;
                    }
                    if(!unico){
                        j=i;
                    }
                }
            }while(!unico);
        }

        //Ahora rellenamos el otro
        for(i = 0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                matriz[i][j] = numeros[k];
                k++;
            }
        }

        //Lo pintamos
        System.out.printf("   ");
        for(i = 0;i<=9;i++){
            System.out.printf("%6d", i);
        }
        
        System.out.println();
        //Pintamos el resto de la tabla
        for(i = 0;i<matriz.length;i++){
            System.out.printf("%d |",i);

            for(j=0;j<matriz[i].length;j++){
                //Comprobacion de maximos y minimos
                if(matriz[i][j]>maximo){
                    maximo = matriz[i][j];
                    filaMax = i;
                    columMax = j;
                }
                if(matriz[i][j]<minimo){
                    minimo = matriz[i][j];
                    filaMin = i;
                    columMin = j;
                }
                //Seguimos pintando
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }
        //Decimos los maximos y minimos
        System.out.printf("El maximo es %d y está en la fila %d y columna %d\n", maximo,filaMax,columMax );
        System.out.printf("El minimo es %d y está en la fila %d y columna %d\n", minimo,filaMin,columMin );

    }
}

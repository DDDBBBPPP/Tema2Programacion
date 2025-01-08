package tema7arrays;

public class Ejercicio32TresEnRaya {
    public static void main(String[] args) throws InterruptedException {
        char[][] matriz = new char[3][3];
        int i;
        int j;
        int filEle = ' ';
        int colEle;
        String elec;
        String textoFinal = "";
        boolean finito = false;
        //Lo rellenamos de espacios
        for(i = 0; i<matriz.length;i++){
            for(j = 0; j<matriz[i].length;j++){
                matriz[i][j] = ' ';
            }
        }

        do{

            maquina(matriz);
            Thread.sleep(1000);
            pintar(matriz);
            textoFinal
            
            //Se elige la posicion y se transforma para el array.
            System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
            elec = System.console().readLine();
            colEle = Integer.parseInt(elec.charAt(1) + "") - 1;
            switch(elec.charAt(0)){
                case 'a':
                filEle = 0;
            break;
            case 'b':
            filEle = 1;
            break;
            case 'c':
            filEle = 2;
            break;
        }
        matriz[filEle][colEle] = 'X';
        pintar(matriz);
        
    }while(!finito);
    }



     /**
      * Pinta la matriz
      * @param matriz
      */
    public static void pintar(char[][] matriz){
        System.out.println("  -------");
        for(int i = 0; i<matriz.length;i++){
            if(i==0){System.out.print("a ");}
            if(i==1){System.out.print("b ");}
            if(i==2){System.out.print("c ");}
            
            for(int j = 0; j<matriz[i].length;j++){
             System.out.print("|" + matriz[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }       
        System.out.println("  -------");

        System.out.println("   1 2 3");
    }


    /**
     * la maquina juega.
     * @param matriz
     */
    public static void maquina(char[][] matriz){
        int j;
        int i;
        boolean hecho = false;
        do{
            i = (int)(Math.random()*3);
            j = (int)(Math.random()*3);

            if(matriz[i][j]==' '){
                matriz[i][j] = '0';
                hecho = true;
            }
        }while(!hecho);
    }

    public static String mensaje(char[][] matriz){
        char c;
        String msj =  "";
        int contador = 0;
        int contFila;

        
        for(int i = 0;i<matriz.length;i++){
        
            for(int j = 0;j<matriz[i].length;j++){
                c = matriz[i][j];
                //Esto para empate.
                if(matriz[i][j]==' '){
                    contador++;
                }
                if(matriz[i][j])


            }

        }
        //Si no ha ganado nadie y no hay espacio pues empate
        if(contador==0 && msj.equals("")){
            msj = "¡EMPATE!";
        }

        return msj;
    }

}

    

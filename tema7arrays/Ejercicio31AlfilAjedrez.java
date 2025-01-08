package tema7arrays;

public class Ejercicio31AlfilAjedrez {
    public static void main(String[] args) {
        int[][]  tablero = new int[8][8];
        int i;
        int j;
        String eleccion;
        String filaa;
        int colEle = 0;
        int filEle = 0;

        System.out.print("Elige una posicion: ");

        eleccion = System.console().readLine();

        switch(eleccion.charAt(0)){
            case 'a':
            colEle = 0;
            break;
            case 'b':
            colEle = 1;
            break;
            case 'c':
            colEle = 2;
            break;
            case 'd':
            colEle = 3;
            break;
            case 'e':
            colEle = 4;        
            break;
            case 'f':
            colEle = 5;    
            break;
            case 'g':
            colEle = 6;    
            break;
            case 'h':
            colEle = 7;

            
            break;
            default:

            System.out.println("Escribe bien crack");
            break;

        }

        switch(eleccion.charAt(1)){
            case '1','2','3','4','5','6','7','8':
           filEle = 8 - Integer.parseInt(eleccion.charAt(1) + "");
            
            break;
            default:

            System.out.println("Escribe bien crack");
            break;

        }
        //VAMOS A PONER EL ALFIL EN EL TABLERO

        for(i = 0;i<tablero.length;i++){
            for(j= 0;j<tablero[i].length;j++){
                System.out.print((i==filEle && j==colEle)?"J":"0");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        tablero[filEle][colEle] = 3;

        //Vamos a Pintar el fcking alfil.
        j = colEle;
        i = filEle;
        //Para arriba a la izquierda.
        while(dentro(i -1,j-1)){
            i--;
            j--;
            tablero[i][j] = 1;
        }

        j = colEle;
        i = filEle;

        //Para arriba a la derecha.
        while(dentro(i -1,j+1)){
            i--;
            j++;
            tablero[i][j] = 1;
        }

        j = colEle;
        i = filEle;

        //Para abajo a la izquierda.
        while(dentro(i +1,j-1)){
            i++;
            j--;
            tablero[i][j] = 1;
        }

        j = colEle;
        i = filEle;

        //Para abajo a la derecha.
        while(dentro(i +1,j+1)){
            i++;
            j++;
            tablero[i][j] = 1;
        }


        for(i=0;i<tablero.length;i++){
            for(j=0;j<tablero[i].length;j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

        //AQUI YA COMPROBAMOS LAS POSICIONES A LAS QUE SE PUEDE MOVER Y LAS PONEMOS EN ORDEN.

        for(i = tablero.length-1;i>=0;i--){
            for(j = 0;j<tablero[i].length;j++){
                if(tablero[i][j]==1){
                    System.out.print(posicion(i, j) + ", ");
                }
            }
        }

    }
    /**
     * Esto comprueba si se sale de rango
     * @param i
     * @param j
     * @return
     */
    public static boolean dentro(int i, int j){
        return ((i<8) && (i>=0) && (j<8) && (j>=0));
    }

    public static String posicion(int i,int j){
        char p1 = '2';
        String pos;
        switch (j){
            case 0 : 
            p1 = 'a';
            break;
            case 1 : 
            p1 = 'b';
            break;
            case 2 : 
            p1 = 'c';
            break;
            case 3 : 
            p1 = 'd';
            break;
            case 4 : 
            p1 = 'e';
            break;
            case 5 : 
            p1 = 'f';
            break;
            case 6 : 
            p1 = 'g';
            break;
            case 7 : 
            p1 = 'h';
            break;
        }

        pos =  (8 - i) + "";
        pos =  p1 + pos;

        return pos;
    }
}


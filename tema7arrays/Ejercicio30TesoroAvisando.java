package tema7arrays;

public class Ejercicio30TesoroAvisando {
    public static void main(String[] args) {
        String[][] matriz = new String[4][5];
        String[][] vacio = new String[4][5];

        int i;
        int j;
        int k;
        int l;
        int mina;
        int tesoro;
        boolean nada = true;
        boolean cuidado = false;

        //ANTES DE NADA RELLENSAMOS EL ARRAY CON DOS ESPACIOS
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                matriz[i][j] = "  ";
                vacio[i][j] = "  ";
            }
        }
        
        mina = (int)(Math.random()*21);
        do{
            tesoro = (int)(Math.random()*21);
        }while(mina==tesoro);
        
        //Vamos a rellenar la matriz con el tesoro y lo otro en su sitio.
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(mina==0){
                    matriz[i][j] = "* ";
                }
                if(tesoro==0){
                    matriz[i][j] = "T ";
                }
                mina--;
                tesoro--;
            }

        }


        //Lo imprimimos una vez con el formato
        System.out.println("BUSCA EL TESORO!");
        //Así lo ve el usuario.
        Ejercicio29Tesoro.pintarArray(vacio);



        //Ahora empezamos el menú que se repite aunque copiaremos esta parte tal cual
        do{
            System.out.print("Coordenada x: ");
            j= Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            i= Integer.parseInt(System.console().readLine());

            //Aquí empezamos con las condiciones.
            if(matriz[i][j].equals("  ")){
                //NUEVAS CONDICIONES PARA VER SI LA MINA ESTÁ CERCA
                //Primero vemos si la i está arriba abajo o en medio
                if(i==3){
                    //Y aquí vemos si la j está pegada o no
                    if(j==0){
                        if(abajo(matriz,i,j)||abajoDer(matriz,i,j)||derecha(matriz,i,j)) cuidado=true;
                    }else if(j==4){
                        if(abajo(matriz,i,j)||abajoIzq(matriz,i,j)||izquierda(matriz,i,j)) cuidado=true;
                    }else{
                        if(abajo(matriz,i,j)||abajoDer(matriz,i,j)||derecha(matriz,i,j)||abajoIzq(matriz,i,j)||izquierda(matriz,i,j)) cuidado=true;
                    }
                }else if(i==0){
                    if(j==0){
                        if(arriba(matriz,i,j)||arribaDer(matriz,i,j)||derecha(matriz,i,j)) cuidado=true;
                    }else if(j==4){
                        if(arriba(matriz,i,j)||arribaIzq(matriz,i,j)||izquierda(matriz,i,j)) cuidado=true;
                    }else{
                        if(arriba(matriz,i,j)||arribaDer(matriz,i,j)||derecha(matriz,i,j)||arribaIzq(matriz,i,j)||izquierda(matriz,i,j)) cuidado=true;
                    }
                }else{
                    if(j==0){
                        if(arriba(matriz,i,j)||arribaDer(matriz,i,j)||derecha(matriz,i,j)||abajoDer(matriz,i,j)||abajo(matriz,i,j)) cuidado=true;
                    }else if(j==4){
                        if(arriba(matriz,i,j)||arribaIzq(matriz,i,j)||izquierda(matriz,i,j)||abajo(matriz,i,j)||abajoIzq(matriz,i,j)) cuidado=true;
                    }else{
                        if(arriba(matriz,i,j)||arribaDer(matriz,i,j)||derecha(matriz,i,j)||arribaIzq(matriz,i,j)||izquierda(matriz,i,j)||abajo(matriz,i,j)||abajoDer(matriz,i,j)
                        ||abajoIzq(matriz,i,j)) cuidado=true;
                    }
                }

                if(cuidado)System.out.println("Cuidado, hay una mina cerca.");

                vacio[i][j] = "X ";
                cuidado = false;
            }else if(matriz[i][j].equals("T ")){
                nada = false;
                System.out.println("¡ENHORABUENA! ¡HAS ENCONTRADO EL TESORO!");

                vacio[i][j] = "T ";
            }else{
                nada = false;
                System.out.println("¡BOOOM! Lo siento, has perdido.");
                // Lo dificil es "Sumar" los dos arrays supongo.
                for(k = 0;k<vacio.length;k++){
                    for(l=0;l<vacio[k].length;l++){
                        vacio[k][l] = (!matriz[k][l].equals("  "))?matriz[k][l]:vacio[k][l];
                    }
                }
            }
            // Repetimos lo de antes tal cual
            Ejercicio29Tesoro.pintarArray(vacio);

        }while(nada);


    }
    /**
     * Comprobamos todas las posiciones
     * @param matriz
     * @param i
     * @param j
     * @return
     */
    public static boolean arribaIzq(String[][] matriz, int i, int j){
        return  matriz[i+1][j-1]== "* ";
    }

    public static boolean arriba(String[][] matriz, int i, int j){
        return  matriz[i+1][j]== "* ";
    }

    public static boolean arribaDer(String[][] matriz, int i, int j){
        return  matriz[i+1][j+1]== "* ";
    }

    public static boolean abajoIzq(String[][] matriz, int i, int j){
        return  matriz[i-1][j-1]== "* ";
    }

    public static boolean abajo(String[][] matriz, int i, int j){
        return  matriz[i-1][j]== "* ";
    }

    public static boolean abajoDer(String[][] matriz, int i, int j){
        return  matriz[i-1][j+1]== "* ";
    }

    public static boolean derecha(String[][] matriz, int i, int j){
        return  matriz[i][j+1]== "* ";
    }

    public static boolean izquierda(String[][] matriz, int i, int j){
        return  matriz[i][j-1]== "* ";
    }

}

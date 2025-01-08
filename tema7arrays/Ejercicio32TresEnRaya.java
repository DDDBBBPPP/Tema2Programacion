package tema7arrays;

public class Ejercicio32TresEnRaya {
    public static void main(String[] args) throws InterruptedException {
        char[][] matriz = new char[3][3];
        int i;
        int j;
        int filEle = ' ';
        int colEle;
        int contador = 0;
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
            if(contador%2==0){

                maquina(matriz);
                Thread.sleep(1000);
                pintar(matriz);
            }else{

                
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
        


            }
            contador++;
            textoFinal = mensaje(matriz);
            if(textoFinal.equals("")){

            }else{
                System.out.println(textoFinal);
                finito = true;
            }
               
    }while(!finito);
    }

    /**
     * Pinta la matriz
     * 
     * @param matriz
     */
    public static void pintar(char[][] matriz) {
        System.out.println("  -------");
        for (int i = 0; i < matriz.length; i++) {
            if (i == 0) {
                System.out.print("a ");
            }
            if (i == 1) {
                System.out.print("b ");
            }
            if (i == 2) {
                System.out.print("c ");
            }

            for (int j = 0; j < matriz[i].length; j++) {
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
     * 
     * @param matriz
     */
    public static void maquina(char[][] matriz) {
        int j;
        int i;
        boolean hecho = false;
        do {
            i = (int) (Math.random() * 3);
            j = (int) (Math.random() * 3);

            if (matriz[i][j] == ' ') {
                matriz[i][j] = '0';
                hecho = true;
            }
        } while (!hecho);
    }

    public static String mensaje(char[][] matriz) {
        String msj = "";
        int contador = 0;
        int contFilaMaq = 0;
        int contFilaJug = 0;
        int c;

        // Las diagonales lo primero
        if (matriz[0][0]=='0' && matriz[1][1]=='0' && matriz[2][2]=='0'){
            msj = "¡Has Perdido!";
        }
        if (matriz[0][0]=='X' && matriz[1][1]=='X' && matriz[2][2]=='X'){
            msj = "¡Enhorabuena! ¡Has ganado!";
        }
        if (matriz[0][2]=='0' && matriz[1][1]=='0' && matriz[2][0]=='0'){
            msj = "¡Has Perdido!";
        }
        if (matriz[0][2]=='X' && matriz[1][1]=='X' && matriz[2][0]=='X'){
            msj = "¡Enhorabuena! ¡Has ganado!";
        }

        // Comprobar columnas
for (c = 0; c < 3; c++) { // Iterar por columnas
    for (int i = 0; i < 3; i++) { // Iterar por filas
        if (matriz[i][c] == '0') {
            contFilaMaq++;
        }
        if (matriz[i][c] == 'X') {
            contFilaJug++;
        }
    }
    if (contFilaMaq == 3) {
        return "¡Has Perdido!";
    }
    if (contFilaJug == 3) {
        return "¡Enhorabuena! ¡Has ganado!";
    }
    contFilaMaq = 0;
    contFilaJug = 0; // Reiniciar contadores para la próxima columna
}

        // En este comprobamos si está vacio o las filas
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                // Esto para empate.
                if (matriz[i][j] == ' ') {
                    contador++;
                }
                // En estas dos comprobamos las filas si alguien ha ganado
                if (matriz[i][j] == '0') {
                    contFilaMaq++;
                }
                if (matriz[i][j] == 'X') {
                    contFilaJug++;
                }
            }
            if (contFilaMaq == 3) {
                msj = "¡Has Perdido!";
            }
            if (contFilaJug == 3) {
                msj = "¡Enhorabuena! ¡Has ganado!";
            }
            contFilaMaq = 0;
            contFilaJug = 0;

        }
        // Si no ha ganado nadie y no hay espacio pues empate
        if (contador == 0 && msj.equals("")) {
            msj = "¡EMPATE!";
        }

        return msj;
    }

}

package tema7arrays;

public class Ejercicio29Tesoro {
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
        pintarArray(vacio);



        //Ahora empezamos el menú que se repite aunque copiaremos esta parte tal cual
        do{
            System.out.print("Coordenada x: ");
            j= Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            i= Integer.parseInt(System.console().readLine());

            //Aquí empezamos con las condiciones.
            if(matriz[i][j].equals("  ")){
                vacio[i][j] = "X ";
            }else if(matriz[i][j].equals("€ ")){
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
            pintarArray(vacio);

        }while(nada);


    }
/**
 * FUNCION QUE ME PINTA EL VACIO
 * @param matriz
 */
    public static void pintarArray(String[][] matriz){
        for(int i=matriz.length-1;i>=0;i--){
            System.out.printf("%d|",i);
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("  ---------");
        System.out.println("  0 1 2 3 4"); 
    }
}

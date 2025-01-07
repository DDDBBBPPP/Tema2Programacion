package tema7arrays;

public class Ejercicio23ArrayBidPrimero {
    public static void main(String[] args) {
        int[][] tabla = new int[3][6];
        int i;
        int j;

        tabla[0][1] = 30;
        tabla[0][2] = 2;
        tabla[0][5] = 5;
        tabla[1][0] = 75;
        tabla[2][2] = -2;
        tabla[2][3] = 9;
        tabla[2][5] = 11;
    
        FunBid.mostrarArray(tabla);

    }
}

package Tema5;

public class Ejercicio19 {
    public static void main(String[] args) {

        int numAComprobar = 2;
        short cero = 0;

        while (numAComprobar <= 100) {
            for (int i = 2; i <= (numAComprobar - 1); i++) {
                if (numAComprobar % i == 0) {
                    cero = 1;
                }
            }
            if (cero == 1) {

            }else{
                System.out.print(numAComprobar + " ");
            }
            cero = 0;
            numAComprobar++;
        }
    }
}

package tema7arrays;

public class Ejercicio2 {

    public static void main(String[] args) {

        int i;
        char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for(i=0;i<10;i++){
            System.out.print(simbolo[i] + ", ");
        }
        //Se pone espacio en blanco lo que no rellenes
    }
}

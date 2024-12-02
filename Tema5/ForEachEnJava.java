package Tema5;

public class ForEachEnJava {
    public static void main(String[] args) {

        int[] numeros = new int[31];

        //Esto recorre todo el array.
        for(int item: numeros){
            System.out.print(item + " ");

        }

        /* // Si pones foreach te hace esto del tirón
        for (int i : numeros) {
            
        } */
    }
}

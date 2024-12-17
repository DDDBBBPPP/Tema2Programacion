package tema7arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int i;
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        for(i = 0;i<12;i++){
            System.out.print(num[i] + ", ");
            //De 0s lo que no rellenes
        }
    }
}

package tema7arrays;

public class Ejercicio4 {
    //Tres arrays, numeros, cuadrado y cubo y mostrarlos en 3 columnas.
    public static void main(String[] args) {
        
        int i;
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        //Primer array
        for(i=0; i<20;i++){
            numero[i] = (int)(Math.random()*100);
        }
        for(i=0; i<20;i++){
            cuadrado[i] = (int)Math.pow(numero[i], 2);
        }
        for(i=0; i<20;i++){
            cubo[i] = (int)Math.pow(numero[i], 3);
            
        }

        System.out.println("   n   |  n2   |  n3   ");
        System.out.println("-----------------------");

        for(i=0;i<20;i++){
            System.out.printf("%6d |%6d | %6d\n", numero[i], cuadrado[i],cubo[i]);
        }
    }
}

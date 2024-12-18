package tema7arrays;

import java.util.Scanner;

public class Ejercicio8TemperaturaYMostrar {
    //Pedir temperatura y mostrarlo en una gráfica.
    public static void main(String[] args) {
        int i;
        int j;
        int[] temperatura = new int[12];
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Scanner sc = new Scanner(System.in);
        //Rellenamos los meses
        System.out.print("Introduzca la temperatura media de enero: ");
        temperatura[0] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de febrero: ");
        temperatura[1] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de marzo: ");
        temperatura[2] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de abril: ");
        temperatura[3] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de mayo: ");
        temperatura[4] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de junio: ");
        temperatura[5] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de julio: ");
        temperatura[6] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de agosto: ");
        temperatura[7] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de septiembre: ");
        temperatura[8] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de octubre: ");
        temperatura[9] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de noviembre: ");
        temperatura[10] = sc.nextInt();
        System.out.print("Introduzca la temperatura media de diciembre: ");
        temperatura[11] = sc.nextInt();

        for(i = 0;i<12;i++){
            //Se pinta el nombre del mes con otro array
            System.out.printf("%12s |",meses[i]);
            //Se pintan los asteriscos
            for(j=0;j<temperatura[i];j++){
                System.out.print("*");
            }
            //Se pintan los grados y el salto de línea
            System.out.printf("%3dºC\n", temperatura[i]);
        }

        sc.close();
    }
}

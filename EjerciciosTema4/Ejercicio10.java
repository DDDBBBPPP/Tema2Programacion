package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int hora;
        int minutos;
        int segundos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = sc.nextInt();
        segundos = 86400 - (hora*3600) - (minutos*60);
        if((hora < 0) && (hora > 24)){
            System.out.println("La hora introducida no es válida.");
        }else if((minutos < 0) && (minutos > 60)){
            System.out.println("Los minutos introducidos no son válidos.");
        }else{
        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minutos, segundos);
        }
        sc.close();
    }
}

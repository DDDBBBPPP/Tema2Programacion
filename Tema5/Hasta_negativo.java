package Tema5;

import java.util.Scanner;

public class Hasta_negativo {
  public static void main(String[] args) {

    int numero;
    int total = 0;
    int suma = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca numeros hasta negativo pulsando enter ");

    System.out.print("? ");
    numero = sc.nextInt();
    while (numero >= 0) {

      suma = suma + numero;
      total++;

      System.out.print("? ");
      numero = sc.nextInt();
    }
    System.out.println("Se han introducido " + total + " numeros en total y la suma es " + suma);
    sc.close();
  }
}

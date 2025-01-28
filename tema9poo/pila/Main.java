package tema9poo.pila;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static final int MAXIMO = 25;

    public static void main(String[] args) {
        int item;
        String linea;
        try {
            Pila pilaA = new Pila(); // Crea una pila con el por defecto
            Pila pilaB = new Pila(100); // Crea una pila con tamaño 100
            Pila pilaC = new Pila(MAXIMO);

            FileReader archivo;// Se importa una clase
            BufferedReader bf;

            // Poblamos la pila
            /*
             * for (int i = 0; i < MAXIMO; i++) {
             * pilaC.apilar(i);
             * }
             */

            try {

                archivo = new FileReader("datos.txt");// abrir/crea el archivo indicado y prepararlo para lectura
                bf = new BufferedReader(archivo); // Proporciona métodos para leer de un archivo de forma flexible y
                                                  // eficiente.
                do {
                    linea = bf.readLine();
                    if (linea != null) {
                        item = Integer.parseInt(bf.readLine());// Lee un valor del archivo y lo guarda en la variable
                                                               // item
                        pilaC.apilar(item);
                    }
                } while (linea != null);
                bf.close(); // CERRAMOS EL BUFFER DE LECTURA
                archivo.close(); // Cerramos el manejador de archivo
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el archivo.");
            } catch (IOException e) {
                System.out.println("Se ha producido un fallo leyendo el archivo.");

            }

            finally {

            }

            // Vemos el ultimo elemento.
            /*
             * item = pilaC.cabecera();
             * pilaC.desapilar();
             * 
             * System.out.println("He desapilado el elemento " + item);
             */

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Se ha producido un error en la pila.");
        }
    }

}

package tema11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioCLase {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Introduzca argumentos.");
        } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("ayuda")) {
                System.out.println("Introduzca el nombre del archivo, y P,L o C.");
            } else if (args[0].equalsIgnoreCase("nombre")) {
                System.out.println("Necesita un segundo argumento");
            } else {
                System.out.println("Introduzca el nombre del archivo, y P,L o C.");
            }

        } else if (args.length == 2) {
            if (args[0].equalsIgnoreCase("ayuda")) {
                System.out.println("Introduzca el nombre del archivo, y P,L o C.");
            } else if (args[0].equalsIgnoreCase("nombre")) {

                if (args[1].equalsIgnoreCase("L")) {
                    try {

                        System.out.println("Total líneas del archivo: " + leerArchivo(args[0], args[1]));
                    } catch (FileNotFoundException fnfe) {
                        System.out.println("El archivo " + args[0] + " no está en la ruta especificada.");
                    }

                } else if (args[1].equalsIgnoreCase("P")) {

                    try {

                        System.out.println("Total palabras del archivo: " + leerArchivo(args[0], args[1]));
                    } catch (FileNotFoundException fnfe) {
                        System.out.println("El archivo " + args[0] + " no está en la ruta especificada.");
                    }

                } else if (args[1].equalsIgnoreCase("C")) {

                    try {

                        System.out.println("Total caracteres del archivo: " + leerArchivo(args[0], args[1]));
                    } catch (FileNotFoundException fnfe) {
                        System.out.println("El archivo " + args[0] + " no está en la ruta especificada.");
                    }

                } else {
                    System.out.println("Introduzca P,L o C");
                }
            } else {
                System.out.println("Introduzca el nombre del archivo, y P,L o C.");
            }
        } else {
            System.out.println("Introduzca solo los argumentos que tocan.");
        }

    }

    public static int leerArchivo(String nombre, String accion) throws FileNotFoundException {
        int resultado;
        String[] palabras;
        int totalLineas = 0;
        int totalPalabras = 0;
        int totalCaracteres;

        try {
            FileReader archivo = new FileReader(nombre);
            BufferedReader br = new BufferedReader(archivo);

            String linea = br.readLine();

            while (linea != null) {
                totalLineas++;

                linea = br.readLine();
            }
            br.close();
        } catch (IOException ioe) {
            System.out.println("Tieso");
        }

        return resultado;
    }
}

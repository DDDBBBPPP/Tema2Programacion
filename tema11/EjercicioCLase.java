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
                System.out.println("Uso: <nombre_del_archivo> [P | L | C]");
            } else {
                System.out.println("Falta el segundo argumento: P, L o C.");
            }
        } else if (args.length == 2) {
            if (args[0].equalsIgnoreCase("ayuda")) {
                System.out.println("Uso: <nombre_del_archivo> [P | L | C]");
            } else {
                String opcion = args[1].toLowerCase();
                try {
                    int resultado = leerArchivo(args[0], opcion);
                    switch (opcion) {
                        case "l":
                            System.out.println("Total líneas del archivo: " + resultado);
                            break;
                        case "p":
                            System.out.println("Total palabras del archivo: " + resultado);
                            break;
                        case "c":
                            System.out.println("Total caracteres del archivo: " + resultado);
                            break;
                        default:
                            System.out.println("Introduzca P, L o C.");
                    }
                } catch (FileNotFoundException fnfe) {
                    System.out.println("El archivo " + args[0] + " no está en la ruta especificada.");
                } catch (IOException ioe) {
                    System.out.println("Error al leer el archivo.");
                }
            }
        } else {
            System.out.println("Introduzca solo los argumentos que tocan.");
        }
    }

    public static int leerArchivo(String nombre, String accion) throws IOException {
        int totalLineas = 0, totalPalabras = 0, totalCaracteres = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                totalLineas++;
                totalPalabras += linea.split("\\s+").length; // Divide correctamente por espacios
                totalCaracteres += linea.length();
            }
        }

        switch (accion) {
            case "l":
                return totalLineas;
            case "p":
                return totalPalabras;
            case "c":
                return totalCaracteres;
            default:
                throw new IllegalArgumentException("Opción inválida. Use 'P', 'L' o 'C'.");
        }
    }
}

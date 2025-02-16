package tema11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej02 {
    public static void main(String[] args) {

        String linea = "";

        try {
            FileReader archivo = new FileReader("primos.dat");
            BufferedReader br = new BufferedReader(archivo);

            do {
                System.out.println(linea);
                linea = br.readLine();

            } while (linea != null);

            br.close();
        } catch (FileNotFoundException fnfe) {

            System.out.println("No se ha encontrado el archivo.");

        } catch (IOException ioe) {
            System.out.println("No se pudo leer el archivo");
        }

    }
}

package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ej04 {
    public static void main(String[] args) {
        ArrayList<String> textos = new ArrayList<String>();
        int i;
        String linea;

        try {
            FileReader archivo = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(archivo);
            FileWriter archivo2 = new FileWriter(args[0] + "_sort.txt");
            BufferedWriter bw = new BufferedWriter(archivo2);

            do{
                linea = br.readLine();
                if(linea!=null){

                    textos.add(linea.trim());
                }
            }while(linea !=null);

             // Imprimir antes de ordenar
             System.out.println("Antes de ordenar:");
             for (String texto : textos) {
                 System.out.println(texto);
             }
 
             // Ordenar el ArrayList
             Collections.sort(textos);
 
             // Imprimir después de ordenar
             System.out.println("Después de ordenar:");
             for (String texto : textos) {
                 System.out.println(texto);
             }


            for (String texto : textos) {
                if (texto != null) {
                    bw.write(texto + "\n");
                }
            }
            System.out.println(textos);

            br.close();
            bw.close();

        } catch(FileNotFoundException fnfe){
            System.out.println( "No se encontró el archivo");
        } 
        catch (IOException ioe) {
            System.out.println("No se pudo leer o escribir.");
        }
    }
}

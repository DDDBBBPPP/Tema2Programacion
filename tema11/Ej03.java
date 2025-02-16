package tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej03 {
    public static void main(String[] args) {

        try {
            FileReader arch1 = new FileReader(args[0]);
            FileReader arch2 = new FileReader(args[1]);
            BufferedReader br1 = new BufferedReader(arch1);
            BufferedReader br2 = new BufferedReader(arch2);
            FileWriter archivo = new FileWriter(args[2]);
            BufferedWriter bw = new BufferedWriter(archivo);

            do{

                if(br1.readLine()!=null){
                  bw.write(br1.readLine() +  "\n");
                }
                if(br2.readLine()!=null){
                    bw.write(br2.readLine() + "\n");
                  }
            }while((br1.readLine()!=null) || (br2.readLine()!=null));


            br1.close();
            br2.close();
            bw.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException ioe) {
            System.out.println(" No se puede leer.");
        }

    }
}

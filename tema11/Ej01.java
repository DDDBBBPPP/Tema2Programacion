package tema11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ej01 {
    public static void main(String[] args) {
        int i;
        int num = 2;
        try{
            FileWriter archivo = new FileWriter("primos.dat");
            BufferedWriter bw = new BufferedWriter(archivo);

            while(num<=500){
                i=2;
                while(i<=(num/2) && (num%i)!=0) {
                    i++;
                }
                
                if(i>(num/2)){
                    bw.write(num + "\n");
                }
                num++;
                
            }
            bw.close();
        }catch(IOException ioe){
            System.out.println("No se ha podido escribir el archvo");

        }
        
    }
}

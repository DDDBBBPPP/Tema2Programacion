package tema11.Ej07;

/**
 * Programación
 * curso 2024|25
 * @author Antonio J. Sánchez Bujaldón
 */

 import java.io.BufferedReader;
 import java.io.BufferedWriter;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.HashMap;
 import java.util.Map.Entry;
 
 public class EJ07 {
 
     private static HashMap<String, String> diccionario ;
 
     public static void main(String[] args) {
 
         int opcion = 0 ;
         String palabra ;
         String significado ;
         
         // inicializamos el HASHMAP
         diccionario = new HashMap<String, String>()  ;
 
         // comprobación de parámetros, lectura del diccionario y/o ejecución de alguna opción
         try {
 
             inicio(args) ;
 
             do {
 
                 menu() ;
                 System.out.print("Opcion? ") ;
                 opcion = Integer.parseInt(System.console().readLine()) ;
 
                 switch(opcion) {
 
                     // CERRAMOS LA APLICACIÓN GUARDANDO PREVIAMENTE EL DICCIONARIO
                     // EN EL ARCHIVO PASADO COMO PARÁMETRO
                     case 0: 
                         guardar(args[0]) ;
                         break ;
 
                     // CONSULTAR PALABRA
                     case 1: 
                         System.out.print("Introduce la palabra en español: ") ;
                         palabra = System.console().readLine() ;
 
                         if (diccionario.containsKey(palabra)) {
                             System.out.printf("El significado de %s es %s\n\n", palabra, diccionario.get(palabra) );
                         } else {
                             System.out.printf("La palabra %s no se encuentra en el diccionario.\n\n", palabra) ;
                         }
 
                         break ;
 
                     // INTRODUCIR PALABRA
                     case 2:
 
                         System.out.println("Introduce la palabra en español: ") ;
                         palabra = System.console().readLine() ;
 
                         System.out.println("Introduce la palabra en inglés: ") ;
                         significado = System.console().readLine() ;
 
                         if (!insertar(palabra, significado)) {
                             System.out.println("La palabra ya existe y no se ha guardado en el diccionario.\n") ;
                         }
 
                         break ;
 
                     //
                     default:
                         System.out.println("Opción incorrecta.\n") ;
                 }
     
             } while (opcion!=0) ;
 
         } catch (Exception excepcion) {
             System.out.println(excepcion.getMessage()) ;
         }
 
     }
 
     /**
      */
     public static void menu() {
 
         System.out.println("DICCIONARIO ESPAÑOL-INGLÉS\n=========================") ;
         System.out.println("0. Salir") ;
         System.out.println("1. Consultar palabra") ;
         System.out.println("2. Añadir palabra") ;
 
     }
     
     /**
      * Comprobamos argumentos:
      * EJ07 diccionario [ palabra_español palabra_ingles ]
      * @param args
      */
     private static void inicio(String[] args) throws Exception {
 
         switch(args.length) {
             case 0:
                 throw new Exception("No se ha especificado el archivo con el diccionario.") ;
                 //break ;
 
             // Nombre del archivo diccionario
             case 1:
                 leerDiccionario(args[0]) ;
                 break ;
 
             // Nombre del archivo diccionario + palabra_español + palabra_ingles
             case 3: 
 
                 // leemos el diccionario
                 leerDiccionario(args[0]) ;
 
                 // insertamos la palabra en el HASHMAP
                 if (!insertar(args[1], args[2])) {
                     System.out.println("La palabra ya existe y no se ha guardado en el diccionario.\n") ;
                 } 
 
                 break ;
             
             default:
                 throw new Exception("Número de párametros incorectos.\nEJ07 diccionario [ palabra_español palabra_ingles ]\n\n") ;				
         }
 
     }
 
     /**
      * @param palabra
      * @param significado
      * @return	devolvemos true si se ha insertado; false en caso contrario
      */
     private static boolean insertar(String palabra, String significado) {
 
         boolean ok = false ;
 
         if (!diccionario.containsKey(palabra)) {
 
             // guardamos la pareja (palabra, significado) en el diccionario
             diccionario.put(palabra, significado) ;
 
             ok = true ;
         }
             
         return ok ;
 
     }
 
     /**
      * @param nombreArchivo
      * @param palabra
      * @param significado
      */
     private static void guardar(String nombreArchivo) throws IOException {
 
         try {
 
             FileWriter archivo = new FileWriter(nombreArchivo) ;
             BufferedWriter bw = new BufferedWriter(archivo) ;
             
             for(Entry<String, String> item : diccionario.entrySet()) {
                 bw.write(item.getKey() + "," + item.getValue()) ;
                 bw.newLine();
             }
 
             // cerramos buffer
             bw.close() ; 
 
             // cerramos manejador de archivo
             archivo.close () ;
 
         } catch(IOException ioe) {
             throw ioe ;
         }
     }
 
     /**
      * @param nombreArchivo
      */
     private static void leerDiccionario(String nombreArchivo) throws Exception {
 
     
         try {
 
             FileReader archivo = new FileReader(nombreArchivo) ;
             BufferedReader br = new BufferedReader(archivo) ;
 
             String linea = br.readLine() ;
 
             while (linea!=null) {
 
                 String[] palabras = linea.split(",") ;
                 diccionario.put(palabras[0], palabras[1]) ;
 
                 linea = br.readLine() ;
             }
 
             // cerramos el buffer
             br.close() ;
 
             //  cerramos el manejador del archivo
             archivo.close() ;
 
         } catch(Exception excepcion) {
             throw excepcion ;			
         }
 
     }
 
 
 
 }

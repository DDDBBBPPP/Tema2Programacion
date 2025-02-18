package tema10colecciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import tema10colecciones.clases.Empleado ;

public class EjemploEmpleado {

    private static final String CARPETA_SALIDA = "salida\\" ;
    private static final String BORRADO_ANSI = "\u001b[2J\u001b[H" ;

    public static void main(String[] args) {

        int op = 0 ;                
		HashMap<String, Empleado> datos = new HashMap<String, Empleado>() ;	    // creamos una colección de empleados utilizando un HASHMAP

        // si me han pasado argumentos (nombre del fichero con los empleados)
        if (args.length > 0) {
            leerListaEmpleados(args[0], datos) ;            
        }

        // rellenamos con datos de prueba
        //datos.put("12345678D", new Empleado("12345678D","Irene", 900)) ;
        //datos.put("12345678B", new Empleado("12345678B","Marta", 1500)) ;        
        //datos.put("12345678A", new Empleado("12345678A","Paco", 1000)) ;
        //datos.put("12345678C", new Empleado("12345678C","Marcos", 1250)) ;
        
        do {
            
            menu() ;
            System.out.print("Opción? ") ;
            op = Integer.parseInt(System.console().readLine()) ;

            switch(op) {

                // OPCIÓN SALIR
                case 0 : break ;

                // OPCIÓN AÑADIR
                case 1 : 
                    nuevoEmpleado(datos) ;
                    break ;

                // OPCIÓN BUSCAR
                case 2 : 
                    buscarEmpleado(datos) ;
                    break ;

                // OPCIÓN LISTAR
                case 3 : 
                    listarEmpleados(datos) ;
                    break  ;

                // OPCIÓN ?????
                case 4 : 
                    listarOrdenado(datos) ;
                    break ;

                 // OPCIÓN GUARDAR LISTA DE EMPLEADOS
                 case  5 : 
                    guardarListaEmpleados(datos) ;
                    break ;  


                default:
                    System.out.println("**ERROR: selecciona una opción correcta.");
            }

            pausa() ;

        } while (op!=0) ;
        
    }

    /**
     */
    private static void menu() {

        clear() ;
        System.out.println("GESTIÓN DE EMPLEADOS:\n====================") ;
        System.out.println("0. Salir") ;
        System.out.println("1. Añadir un empleado") ;
        System.out.println("2. Buscar empleado") ;
        System.out.println("3. Listar empleados") ;
        System.out.println("4. Listar empleados ordenados por DNI") ;
        //System.out.println("5. Leer lista de empleados") ;
        System.out.println("5. Guardar lista de empleados") ;
    }

    /**
     * @param datos
     */
    private static void nuevoEmpleado(HashMap<String, Empleado> datos) {

        int edad ;
        double salario ;

        String dni ;
        String nombre ;

        Empleado empleado ;

        System.out.println("AÑADIR EMPLEADO:\n====================");
        System.out.print("DNI: ") ;
        dni = System.console().readLine() ;

        System.out.print("Nombre: ") ;
        nombre = System.console().readLine() ;

        System.out.print("Edad: ") ;
        edad = Integer.parseInt(System.console().readLine()) ;

        System.out.print("Salario: ") ;
        salario = Double.parseDouble(System.console().readLine()) ;

        // creamos el empleado
        empleado = new Empleado(dni, nombre, salario) ;
        empleado.setEdad(edad) ;

        // guardamos el empleado en la colección de datos
        //datos.add(empleado) ;	// con arraylist
		datos.put(dni, empleado) ;
    }

    /**
     * @param datos
     * @return
     */
    private static void buscarEmpleado(HashMap<String, Empleado> datos) {

		String dni ;
		Empleado empleado ;
		
        System.out.println("BUSCAR EMPLEADO:\n====================");
        System.out.print("DNI: ") ;
        dni = System.console().readLine() ;

        // mostramos el resultado
        System.out.println( datos.containsKey(dni)?datos.get(dni): "No se ha encontrado el empleado con DNI " + dni) ;

        // SÓLO ES NECESARIO CON ARRAYLIST
		// buscamos el empleado por su dni
		//empleado = buscar(dni, datos) ;

		// mostramos resultado
		//System.out.println( (empleado!=null)?empleado:"No se ha encontrado el empleado con DNI " + dni  );

    } 

	/**
	 * @param dni
	 * @param datos
	 * @return
	 */
	private static Empleado buscar(String dni, HashMap<String, Empleado> datos) {

		int i = 0 ;
		Empleado empleado = null ;

        return datos.containsKey(dni)?datos.get(dni):null ;
	}

    /**
     * @param datos
     */
    private static void listarEmpleados(HashMap<String, Empleado> datos) {

        System.out.println("LISTADO DE EMPLEADOS:\n====================");

        if(datos.size() == 0) {
            System.out.println("Aún no hay empleados en la agenda.");
        } else {

            for(Entry<String, Empleado> item : datos.entrySet()) {
                System.out.println(item.getValue()) ;
                System.out.println("-----------------------------") ;
            }
        }
    }

    /**
     * @param datos
     */
    private static void listarOrdenado(HashMap<String, Empleado> datos) {

        ArrayList<Empleado> coleccion = new ArrayList<Empleado>() ;

        // introducimos todos los valores del HashMap en un ArrayList
        coleccion.addAll(datos.values()) ;

        // ordenamos el ArrayList
        coleccion.sort(null) ; 
        
        // mostramos el ArrayList
        System.out.println("LISTADO DE EMPLEADOS ORDENADO POR DNI:\n====================");
        for(Empleado item : coleccion) {
            System.out.println(item) ;
            System.out.println("-----------------------------") ;
        }
    }

    /**
     * @param nombreFichero
     * @return
     */
    private static void leerListaEmpleados(String nombreFichero, HashMap<String, Empleado> datos) {

        String[] info ;        
        //ArrayList<Empleado> listado = new ArrayList<Empleado>() ;

        try {

            FileReader archivo = new FileReader(CARPETA_SALIDA + nombreFichero + ".txt")  ;
            BufferedReader br = new BufferedReader(archivo) ;
            String linea = br.readLine() ;

            while(linea!=null) {

                // partimos por la coma los valores leídos 
                info = linea.split(",") ;

                // guardamos el Empleado el array list
                Empleado empleado = new Empleado(info[0], info[1], Double.parseDouble(info[3]) )  ;
                                 empleado.setEdad( Integer.parseInt(info[2]) ) ;

                // guardamos directamente en el HASHMAP
                datos.put(info[0], empleado) ;
                
                // volvemos a leer del archivo
                linea = br.readLine() ;
            }

            br.close();
            archivo.close();

        } catch(FileNotFoundException fnfe) {
            System.out.println("Se ha producido un error: no se encuentra el archivo.");
        } catch(IOException ioe) {
            System.out.println("Se ha producido un error al intentar escribir el archivo.");
        }

       // return listado ;

    }

    /**
     * @param datos
     */
    private static void guardarListaEmpleados(HashMap<String, Empleado> datos) {

        String nombreFichero ;

        System.out.println("GUARDAR LISTA DE EMPLEADOS:\n====================");
        System.out.print("Fichero de salida: ") ;
        nombreFichero = System.console().readLine() ;

        // creamos la carpeta si no existe
        File ruta = new File(CARPETA_SALIDA) ;
        if (!ruta.exists()) {  ruta.mkdirs() ; }        
        // ###############################

        try {

            FileWriter archivo = new FileWriter(CARPETA_SALIDA + nombreFichero + ".txt") ;
            BufferedWriter bw = new BufferedWriter(archivo) ;

            for(Entry<String, Empleado> item  : datos.entrySet()) {
                Empleado empleado = item.getValue() ;
                
                bw.write(empleado.getDni() + ",") ;
                bw.write(empleado.getNombre() + ",") ;
                bw.write(empleado.getEdad() + ",") ;
                bw.write(empleado.getSalario() + "\n") ;
            }

            bw.close() ;
            archivo.close();

        } catch(IOException ioe) {
            System.out.println("Se ha producido un error al intentar escribir el archivo.") ;
            System.out.println(ioe.getMessage()) ;
        } 
    }

    /** */
    private static void clear() {
        //for(int i=0; i < 50; i++) { System.out.println(); }
        System.out.print(BORRADO_ANSI);
    }

    /** */
    private static void pausa() {
        System.out.print("Pulsa ENTER para continuar...") ;
        System.console().readLine() ;
    }
    
}

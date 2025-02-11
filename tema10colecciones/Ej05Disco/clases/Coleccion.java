package tema10colecciones.Ej05Disco.clases;

import java.util.ArrayList;

public class Coleccion {
    MIRAR QUE ESTÁ MAL.

    private ArrayList<Disco> coleccion ;     // colección de discos

    /**
     * Constructor de la clase
     */
    public Coleccion() {
        this.coleccion = new ArrayList<Disco>();

        this.vaciar();  // inicializamos el almacén de discos
    }

    /**
     * Vacía la colección de discos
     */
    private void vaciar() {
        for(int i=0; i < this.coleccion.size(); i++) {
            this.coleccion.clear();
        }
    }

    /**
     * Devuelve true si la colección de discos está vacía
     * @return
     */
    public boolean esVacia() {
        return this.coleccion.isEmpty();
    }


    /**
     * Busca un disco por su código y devolvemos la posición
     * en que se encuentra dentro de la colección
     * @param codigo
     * @return
     */
    private int buscarPosicion(String codigo) {

        int i = 0;
        boolean encontrado = false ;

        while (!encontrado && i<this.coleccion.size()) {  // Verifica que i no sea mayor que MAXIMO
            if ( this.coleccion.get(i).getCodigo().equals(codigo)) {
                encontrado = true;
            } else {
                i++;
            }
        }
    
        // Devuelve la posición si se encontró el disco, o -1 si no
        return (encontrado) ? i : -1;
    }

    /**
     * Inserta un nuevo disco en la colección y devuelve true; en otro
     * caso, devuelve false.
     * @param disco
     */
    public boolean insertar(Disco disco) {

        return true;
    }

    /**
     * Elimina el disco indicado y devolvemos true; en otro caso,
     * se devuelve false.
     * @param codigo
     * @return
     */
    public boolean eliminar(String codigo) {

        int pos ;
        boolean ok = false ;

        if (!this.esVacia()) {
            pos = this.buscarPosicion(codigo) ; // buscamos el disco
            ok = pos != -1 ; // comprobamos si hemos encontrado el disco

            // si hemos encontrado el disco lo eliminamos de la colección
            if (ok) {
                this.coleccion.remove(pos);
            }
        }

        return ok ; // devolvemos el resultado de la operación
    }

    /**
     * Lee un valor desde teclado y lo devuelve si ha cambiado con
     * respecto al indicado como parámetro
     * @param valorActual
     * @return
     */
    private String leerDato(String valorActual) {
        String dato = System.console().readLine() ;
        return dato.isEmpty() ? valorActual : dato;
    }

    /**
     * Modificamos el disco que se nos indica 
     * @param disco
     * @return
     */
    public boolean modificar(String codigo) {

        int pos = this.buscarPosicion(codigo) ; // buscamos el disco 
        boolean ok = pos != -1 ;    // comprobamos si hemos encontrado el disco

        if (ok) {

            // recuperamos el disco
            Disco disco = this.coleccion.get(pos);

            // mostramos información del disco
            System.out.println(disco) ;

            // solicitamos los nuevos datos
            System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.") ;
            System.out.print("Título: ");
            disco.setTitulo(leerDato(disco.getTitulo()));

            System.out.print("Autor: ");
            disco.setAutor(leerDato(disco.getAutor()));

            System.out.print("Género: ");
            disco.setGenero(leerDato(disco.getGenero()));

            System.out.print("Duración: ");
            int duracion = disco.getDuracion() ;
                duracion = Integer.parseInt(leerDato(String.valueOf(duracion))) ;
            disco.setDuracion(duracion);
        }

        return ok ; // devolvemos true si hemos modificado el disco
    }

    /**
     * Muestra un listado de todos los discos de la colección
     */
    public boolean listar() {

        boolean ok = this.esVacia() ;

        if (!ok) {

            System.out.println("----------------------------");

            for(int i=0; i < this.coleccion.size(); i++) {    
                    System.out.println(this.coleccion.get(i));
                    System.out.println("----------------------------");
            }
        }

        return !ok ; // devuelve true si ha listado la coleccion
    }

    /**
     * Buscamos el disco del código indicado
     * @param codigo
     * @return
     */
    public Disco buscar(String codigo) {

        int pos = this.buscarPosicion(codigo) ;
        boolean ok = pos!=-1;

        return ok?this.coleccion.get(pos):null ;

    }
}

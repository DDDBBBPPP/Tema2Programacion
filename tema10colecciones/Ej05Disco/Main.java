package tema10colecciones.Ej05Disco;

import tema10colecciones.Ej05Disco.clases.Coleccion;
import tema10colecciones.Ej05Disco.clases.Disco;
public class Main {

    // definimos la colección como una propiedad de la clase ya que
    // vamos a tener que utilizarla en todos los métodos de la clase.
    private static Coleccion coleccion;

    public static void main(String[] args) {

        int op = 0;

        // iniciamos la colección
        coleccion = new Coleccion();

        do {
            try {
                menu(); // mostramos el menú

                System.out.print("Introduce una opción: ");
                op = Integer.parseInt(System.console().readLine());
            } catch (Exception exception) {
                System.out.println("Se debe introducir un valor numérico.");
            }

            switch (op) {

                // LISTAR COLECCIÓN DE DISCOS
                case 1:

                    System.out.println("LISTAR\n===========");

                    if (!coleccion.listar()) {
                        System.out.println("La colección está vacía.");
                    }

                    break;

                // CREAR UN NUEVO DISCO
                case 2:

                    System.out.println("NUEVO DISCO\n===========");
                    nuevoDisco();
                    break;
                case 3:
                    System.out.println("MODIFICAR DISCO\n===========");
                    modificarDisco();
                    break;

                // ELIMINAR DISCO
                case 4:
                    System.out.println("ELIMINAR DISCO\n===========");
                    eliminarDisco();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Introduce una opción correcta.");
            }

        } while (op != 5);

    }

    /**
     * Muestra el menú en pantalla
     */
    private static void menu() {
        System.out.println("\nCOLECCIÓN DE DISCOS:\n====================\n");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
    }

    /**
     * Introducimos un nuevo disco
     */
    private static void nuevoDisco() {

        String codigo;
        String titulo;
        String autor;
        String genero;
        int duracion;

            try {
                System.out.println("Por favor, introduzca los datos del disco.");
                System.out.print("Código: ");
                codigo = System.console().readLine();

                System.out.print("Título: ");
                titulo = System.console().readLine();

                System.out.print("Autor: ");
                autor = System.console().readLine();

                System.out.print("Género: ");
                genero = System.console().readLine();

                System.out.print("Duración: ");
                duracion = Integer.parseInt(System.console().readLine());

                    coleccion.insertar(new Disco(codigo, autor, titulo, genero, duracion));
                

            } catch (Exception excepcion) {
                System.out.println("Se ha producido un error en la inserción de datos.");
            }
    }

    /**
     * Modificamos un disco
     */
    private static void modificarDisco() {

        System.out.println("Por favor, introduzca el código del disco cuyos datos desea cambiar:");
        String codigo = System.console().readLine();

        if (!coleccion.modificar(codigo)) {
            System.out.println("No se encuentra el álbum indicado.");
        }
    }

    /**
     * Elimina un disco de la colección
     */
    private static void eliminarDisco() {

        if (coleccion.esVacia()) {
            System.out.println("La colección está vacía. No hay elementos que eliminar.");
        } else {

            System.out.print("Ingrese el código del disco: ");
            String codigo = System.console().readLine();

            if (!coleccion.eliminar(codigo)) {
                System.out.println("El disco no se ha encontrado o no se ha podido eliminar.");
            } else {
                System.out.println("Album borrado.");
            }
        }

    }

}

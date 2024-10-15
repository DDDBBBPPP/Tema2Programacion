public class Formato {
    public static void main(String[] args) {
        int numEntero = 15;
        double numReal = 4.54576567;
        char fet = 'a';
        String tete = "Ayayaay";
        //Modificador de formato. El %d es para números enteros, %f para numero real.%s para Strings. %c para un caracter
        System.out.printf("El número %d no tiene decimales, %f si, %c esto es chiquito, %s es una cadena.\n" , numEntero, numReal, fet, tete);
        // eso solo vale para dentro de la cadena sustituir el % no se que al argumento que le de
        // Le puedes meter todos los argumentos que quieras separados por comas
        // El printf no permite salto de línea, así que se usa \n para el salto de línea.
        System.out.printf("El número %d no tiene decimales, %f si, %c esto es chiquito, %s es una cadena.\n" , numEntero, numReal, fet, tete);
        // eso solo vale para dentro de la cadena sustituir el % no se que al argumento que le de
        


        // Para imprimir el caracter "%" se pone dos seguidos en la cadena desps del número, si no da error.
        System.out.printf("Porcentaje %d%%\n",numEntero);

        //Aquí digo solo que 2 decimales el numReal double ese. con el %.(n)f
        System.out.printf("Solo 2 decimales %.2f\n", numReal);

        //Aquí si quiero alinear diferentes números enteros por ejemplo con huecos a la izquierda
        System.out.printf("%6d\n", numEntero);
        System.out.printf("%6d\n",125);
        System.out.printf("%6d\n",2);



        //Para escribir " dentro de un print, se usa el \n
        System.out.println("Me dijo: \"Adios\".");
    }
    
}

package EjerciciosTema3;

public class Ej2Tema3 {
    public static void main(String[] args) {
        float euros;
        String linea;
        int pesetas;
        // Voy a pasar euros a entero para que no me salgan decimales.
        System.out.print("Introduzca la cantidad de euros que quiere convertir ");
        linea = System.console().readLine();
        euros = Float.parseFloat(linea);
        pesetas =(int)(euros * 166.386f);
        

        System.out.printf("%.2f euros son %d pesetas\n", euros, pesetas);
        // Para iniciar constantes, en mayusucla todo y separado por barras bajas las palabras. Snake_case. DENTRO DE LA CLASE Y FUERA DEL MAIN
        // Por ejemplo "private static final float CAMBIO = 166.386f;"
    }
}

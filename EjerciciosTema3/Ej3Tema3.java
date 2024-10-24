package EjerciciosTema3;

public class Ej3Tema3 {

    private static final float CAMBIO = 166.38f;
    public static void main(String[] args) {
        int pesetas;
        float euros;
        System.out.print("Introduzca la cantidad de pesetas que quiere convertir ");
        pesetas = Integer.parseInt(System.console().readLine());

        euros = pesetas/CAMBIO;

        System.out.println( pesetas + " pesetas son " + euros + " euros.");
    }
}

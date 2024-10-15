public class Colores {
    public static void main(String[] args) {
        System.out.println("\033[32mSilvestre"); // Aquí le he puesto el verde y se queda
        System.out.println("Garfield");
        System.out.println("telita");
        System.out.println("Piolin");
        System.out.println("Aydt Santa Claus\033[37m"); // A partir de aquí se pinta blanco. El 37 es el blanco

        System.out.println("\033[35mSilvestre\033[37m"); // Aquí le he puesto el morado y lo quito en la misma linea 
        System.out.println("Garfield");
        System.out.println("telita");
        System.out.println("Piolin");
        System.out.println("Aydt Santa Claus");
    }
    
}

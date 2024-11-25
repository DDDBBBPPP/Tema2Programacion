package EjerciciosTema1;

public class Pruebas {
    public static void main(String[] args) {
        
        System.out.println("\033[32m Hola que tal \033[0m");
        System.out.println("\033[32;1m Hola que tal \033[0m");
        System.out.println("\033[32m Hola que tal \033[0m");
        for(int i = 1; i<= 100;i++){
            System.out.println((int)(Math.random()*(99-10)+10));
        }
    }
}

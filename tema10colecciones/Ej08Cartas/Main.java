package tema10colecciones.Ej08Cartas;

import tema10colecciones.Ej08Cartas.clases.Baraja;

public class Main {
    public static final String[] palos = { "Corazones", "Espadas", "Oros", "Bastos" };

    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        int numero;
        String palo;
        int i = 0;
        boolean siguiente = false;

        System.out.println("Vamos a generar las 10 cartas.");

        do {
            do {
                numero = random(13, 1);
                palo = palo();
                if()

            } while (!siguiente);
            siguiente = false;
            i++;
        } while (i < 10);

    }

    public static int random(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static String palo() {
        int num = random(4, 0);

        return palos[num];
    }
}

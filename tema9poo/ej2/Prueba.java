package tema9poo.ej2;

public class Prueba {
    public static void main(String[] args) {
        Caballo santi = new Caballo("Santi");
        Caballo tete = new Caballo("Tete");
        System.out.println(santi);
        santi.trota();
        santi.relincha();
        System.out.println(tete);
        tete.come();
        tete.trota();
        

    }
}

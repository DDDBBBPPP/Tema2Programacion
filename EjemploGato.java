public class EjemploGato{
    public static void main(String args[]){

        Gato gatoA = new Gato(); // Se llama instanciar la clase
        Gato gatoB = new Gato();

        gatoA.nombre = "Garfield";
        gatoA.edad = 13;
        gatoA.chip = "dgghft5";

        gatoB.nombre = "Silvestre";
        gatoB.edad = 30;
        gatoB.chip = "56647gh";

        System.out.println("El gato se llama" + gatoA.nombre);
        System.out.println("El gato se llama" + gatoB.nombre);

        gatoA.maullar(); // Llamamos al método
    }
}
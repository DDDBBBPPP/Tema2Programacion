package tema9poo.ej4;

public class Probar {
    public static void main(String[] args) {
        Fraccion operacion = new Fraccion(-7, 8);
        Fraccion gordo = new Fraccion(-910, 350);

        System.out.println(operacion.multiplica(5));
        System.out.println(operacion.invierte());
        System.out.println(operacion.multiplicaFrac(3,5));
        System.out.println(operacion.divideFrac(3,5));
        System.out.println(gordo.simplifica());



        
    }

   
}

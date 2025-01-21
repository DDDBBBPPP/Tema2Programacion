package tema9poo.ej4;

public class Probar {
    public static void main(String[] args) {
        Fraccion operacion = new Fraccion(-7, 8);
        Fraccion gordo = new Fraccion(-910, 350);
        Fraccion ope = new Fraccion(3,5);

        System.out.println(operacion  + "x 5 = " + operacion.multiplica(5));
        System.out.println(operacion  + "^-1  = " +operacion.invierte());
        System.out.println(operacion  + "x 3/5 = " + operacion.multiplica(ope));
        System.out.println(operacion  + "/ 3/5 = " + operacion.divideFrac(ope));
        System.out.println(gordo + "= " + gordo.simplifica());
    }

   
}

package tema9poo.ej5;

public class Main {
    public static void main(String[] args) {

        Coche mercedes = new Coche();
        Bicicleta bici = new Bicicleta();
        int opcion = 0;

        do {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta.");
            System.out.println("6. Ver kilometraje del coche.");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8):");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    bici.anda(Float.parseFloat(System.console().readLine()));
                    break;
                case 2:
                    bici.vacilar();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    mercedes.anda(Float.parseFloat(System.console().readLine()));
                    break;
                case 4:
                    mercedes.vacilar();
                    break;
                case 5:
                    bici.comprobar();
                    break;
                case 6:
                    mercedes.comprobar();
                    break;
                case 7:
                    System.out.println("Se han recorrido un total de " + Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    break;

                default:
                System.out.println("Elige una opción correcta.");
                    break;
            }
            if(opcion!=8){

                System.console().readLine();
            }

        } while (opcion != 8);
    }
}

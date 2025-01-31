package tema9poo.ej22;

public class Main {

    public static final int MAXIMO = 10;
    public static void main(String[] args) {
        
        Disco[] discos = new Disco[10];
        int opcion = 0;

        discos[0] = new Disco("G4343j", "Tumbao", "Primer disco", "Música Triste", 45);
        discos[2] = new Disco("123144", "Jaime Moicano", "Otro disco", "Alegre", 10);
        discos[4] = new Disco("LKH73H", "Sara Oteca", "Buen disco", "Chunda Chunda", 5);



        try{
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(System.console().readLine());
            
            do{
                
                switch (opcion) {
                    case 1:
                    
                    break;
                    case 2:
                    
                    break;
                    case 3:
                    
                    break;
                    case 4:
                    
                    break;
                    case 5:
                    
                    break;
                    
                    default:
                    System.out.println("Por favor, seleccione una opción correcta.");
                    break;
                }
                
               
            
            }while(opcion!=5);
            
        }catch(Exception e){

            System.out.println("Haz las cosas bien por favor.");
        }

    

}

}
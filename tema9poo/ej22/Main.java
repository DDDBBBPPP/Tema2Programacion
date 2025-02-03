package tema9poo.ej22;

public class Main {

    public static final int MAXIMO = 10;

    public static void main(String[] args) {

        Disco[] discos = new Disco[MAXIMO];
        int i;
        String mod;
        int opcion = 0;

        discos[0] = new Disco("G4343j", "Tumbao", "Primer disco", "Música Triste", 45);
        discos[2] = new Disco("123144", "Jaime Moicano", "Otro disco", "Alegre", 10);
        discos[4] = new Disco("LKH73H", "Sara Oteca", "Buen disco", "Chunda Chunda", 5);
        try {

            do {

                menu();
                System.out.print("Introduzca una opción: ");
                opcion = Integer.parseInt(System.console().readLine());

                switch (opcion) {
                    case 1:

                        for (i = 0; i < discos.length; i++) {
                            if (discos[i] != null) {
                                System.out.println("----------------------------");
                                System.out.println(discos[i]);
                                System.out.println("----------------------------");
                            } else {

                            }
                        }

                        break;
                    case 2:

                    for(i=0;i<discos.length;i++){
                        if(discos[i]==null){
                            discos[i] = new Disco(); 
                            nuevo(discos[i]);
                            i=10;
                        }
                    }

                        break;
                    case 3:
                        System.out.println("MODIFICAR\n==========");
                        System.out.print("Introduzca los nuevos datos del disco o INTRO" +
                        " para dejarlos igual." );
                        mod= System.console().readLine();
                        if(mod.equals("")){
                            System.out.println("No has seleccionado ninguno.");
                        }else{
                            for(i=0;i<discos.length;i++){
                                if(discos[i].getCodigo()==mod){
                                    modificar(discos[i]);
                                    i=10; 
                                }
                            }
                            if(i!=11){
                                System.out.println("No se encuentra el código");
                            }
                        }
                        
                        
                        break;
                    case 4:
                        System.out.println("BORRAR\n=====");
                        System.out.print("Por favor, introduzca el código del disco que" +
                        " desea borrar: ");
                        mod = System.console().readLine();
                        for(i=0;i<discos.length;i++){
                            if(discos[i].getCodigo()==mod){
                                discos[i]= null;
                                System.out.println("Album borrado.");
                            }
                        }
                        
                        break;
                    case 5:
                        System.out.println("¡Hasta pronto!.");
                        break;

                    default:
                        System.out.println("Por favor, seleccione una opción correcta.");
                        break;
                }

                System.console().readLine();
            } while (opcion != 5);

        } catch (Exception e) {

            System.out.println("Haz las cosas bien por favor.");
        }

    }

    public static void menu() {
        System.out.println("COLECCIÓN DE DISCOS\n==================");
        System.out.println("1. Listado\n2. Nuevo disco\n3. Modificar");
        System.out.println("4. Borrar\n5. Salir\n");
    }

    public static void nuevo(Disco discos){
        System.out.println("NUEVO DISCO\n============");
        System.out.println("Por favor, introduzca los datos del disco.");
        System.out.print("Código: ");
        discos.setCodigo(System.console().readLine());
        System.out.print("Autor: ");
        discos.setAutor(System.console().readLine());
        System.out.print("Título: ");
        discos.setTitulo(System.console().readLine());
        System.out.print("Género: ");
        discos.setGenero(System.console().readLine());
        System.out.print("Duración: ");
        discos.setDuracion(Integer.parseInt(System.console().readLine()));
    }


    public static void modificar(Disco discos){
        String ele;
        System.out.println("Código: " + discos.getCodigo());
        System.out.print("Nuevo código: ");
        ele = System.console().readLine();
        if(!ele.equals("")){
            discos.setCodigo(ele);
        }
        System.out.println("Autor: " + discos.getAutor());
        System.out.print("Nuevo autor: ");
        ele = System.console().readLine();
        if(!ele.equals("")){
            discos.setAutor(ele);
        }
        System.out.println("Título: " + discos.getTitulo());
        System.out.print("Nuevo código: ");
        ele = System.console().readLine();
        if(!ele.equals("")){
            discos.setTitulo(ele);
        }
        System.out.println("Género: " + discos.getGenero());
        System.out.print("Nuevo género: ");
        ele = System.console().readLine();
        if(!ele.equals("")){
            discos.setGenero(ele);
        }
        System.out.println("Duración: " + discos.getDuracion());
        System.out.print("Duración: ");
        ele = System.console().readLine();
        if(!ele.equals("")){
            discos.setDuracion(Integer.parseInt(ele));
        }
        

    }




}
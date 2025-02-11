package tema10colecciones.Ej06;

import java.util.HashMap;

public class Mapa {
    public static void main(String[] args) {

        HashMap<String, String> cuentas = new HashMap<String, String>();
        String usuario;
        String clave;
        boolean concuerda = false;
        int i = 0;
        

        cuentas.put("Homi","1234");
        cuentas.put("Tete","1tg4");
        cuentas.put("Jeje","fgg4");
        System.out.println("Intente acceder a nuestro sistema.");
        do{
            System.out.print("Introduzca un usuario válido: ");
            usuario = System.console().readLine();
            System.out.print("Introduzca la contraseña: ");
            clave = System.console().readLine();
            for(String item: cuentas.keySet()){
                if(usuario.equals(item)){
                    concuerda = (clave.equals(cuentas.get(item)));
                    i=3;
                }
            }
            i++;
        }while( i<3);

        if(concuerda){
            System.out.println("Ha accedido al área restringida.");
        }else{
            System.out.println("Lo siento, no tiene acceso al área restringida.");
        }
    }
}
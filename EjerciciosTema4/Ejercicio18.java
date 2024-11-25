package EjerciciosTema4;

public class Ejercicio18 {
    public static void main(String[] args) {
        Integer  num; //Integer num; se puede hacer. Integer es una clase, Integer es un wrapper(envoltorio) del tipo int.
        boolean capicua = false; // Double es una clase, y envoltorio del tipo primitivo double.
        String cadenaInvertida = "";
        String cadena;

        System.out.print("Introduce un número entero (de 5 cifras como máximo): ");
        num = Integer.parseInt(System.console().readLine());

        //comprobamos si el número es capicúa.
        if(num<0){
            System.out.println("Solo números enteros positivos.");
        }else if(num <10){
            capicua = true;
        }else if(num < 100){
            if((num/10) == (num%10)){
                capicua = true;
            }
        } else if (num < 1000){
            if((num/100) == (num%100)){
                capicua = true;

            }
        }
        


        //Decimos si es capicúa o no.
        if(capicua == true){
            System.out.println("Es capicúa.");
        }else{
            System.out.println("No es capicúa.");
        }
        // con un BUCLE VAMOS A DARLE LA VUELTA A UNA CADENA.
        cadena = Integer.toString(num);
        for(int i=cadena.length();i>0;i--){
            cadenaInvertida = cadenaInvertida +  cadena.charAt(i-1);
            
        }
        System.out.println(cadenaInvertida);
        /* for(int i=0;i<cadena.length();i++){
            cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
            
        }
        System.out.println(cadenaInvertida); */
        // Después podríamos 
    }
}

package funciones;

public class Matematicas {
    public static void main(String[] args) {
        int num = 565005;
        int dig = 7;
        
        System.out.println(pegaPorDelante(num, dig));
    }
/**
 * Voltea el número
 * @param numero
 * @return
 */
/* @Override ESTO SE PUEDE HACER, PERO SI ESTAN EN DIFERENTES CLASES
SE PONE CUANDO LAS CLASES ESTAN SOBRECARGADAS.
Se pueden tener dos funciones iguales con mismo nombre
Mientras cambie algo. */
    public static int voltea(int numero) {
        int inverso = 0;
        while (numero > 0) {
            inverso = inverso * 10 + (numero % 10);
            numero = numero / 10;
        }
        return inverso;
    }


/**
 * Voltea el número
 * @param numero
 * @return
 */
//@Override Recuerda, se usa cuando las funciones están en diferentes clases.
public static long voltea(long numero) {
    long inverso = 0;
    while (numero > 0) {
        inverso = inverso * 10 + (numero % 10);
        numero = numero / 10;
    }
    return inverso;
}
/**
 * Escribe un número dado en vertical
 * @param num
 */
    public static void escribeEnVertical(int num){
        //calculamos longitud
        int longitud = digitos(num);

        //invertimos el número original
        num = voltea(num);

        //lo escribimos por pantalla
        for(;longitud>0;longitud--){
            System.out.printf("%d\n",num%10);
            num/=10;
        }
    }

/**
 * Te dice si es capicúa
 * @param numero
 * @return
 */
    public static boolean esCapicua(int numero) {
        return (numero == voltea(numero));
    }
/**
 * Te dice si es primo
 * @param num
 * @return
 */
    public static boolean esPrimo(int num){
        int contador = 2;
        while (contador <= (num / 2) && (num % contador) != 0) {
            contador++;
        }
        return (contador>(num/2));

    }
    /**
     * Te dice el siguiente número primo al que se introduce
     * @param num
     * @return
     */
    public static int siguienteprimo(int num){
        
        do{
            num++;
        }while(!esPrimo(num));
        return num;
    }
/**
 * Calcula el resultado de base al exponente que se pasan
 * @param base
 * @param bucle
 * @return
 */
    public static int potencia(int base, int bucle){
           int potenciass = 1;
           for(int i = 0; i < bucle;i++){
            potenciass = potenciass*base;
           }      
        return potenciass;
    }
/**
 * Cuenta el número de dígitos del número pasado
 * @param num
 * @return
 */
    public static int digitos(int num){
        int digito = 0;
        while(num>0){
            num/=10;
            digito++;
        }
        return digito;
    }
/**
 * Devuelve la posicion del digito en el número
 * @param num
 * @param posicion
 * @return
 */
    public static int digitoEnPos(int num, int posicion){
        int longitud = digitos(num);
        for(int i = 1; i<longitud - posicion;i++){
            num/=10;
        }
        return num%10;
    }
/**
 * Te dice la posicion de la primera vez que aparece un dígito
 *  en el número de izquierda a derecha
 * @param num
 * @param digito
 * @return
 */
    public static int posicionDeDigito(int num, int digito){
        int longitud = digitos(num);
        num = voltea(num);
        int posicion = longitud;

        while((num%10) != digito){
            num/=10;
            longitud--;
        }
        return posicion - longitud + 1;
        
    }

    public static int quitarPorDetras(int num, int cantidad){
        return num/(int)Math.pow(10, cantidad);
    }

    public static int quitarPorDelante(int num, int cantidad){
        int longi = digitos(num);
        int inverso = voltea(num)/(int)Math.pow(10, cantidad);
        int longIn = digitos(inverso) ;
        return voltea(inverso)*(int)Math.pow(10, longi - longIn - cantidad);
    }

    public static int pegaPorDetras(int num, int digito){
        return num*10 + digito;
    }
/**
 * Pone delante del número el dígito que te dan.
 * @param num
 * @param digito
 * @return
 */
    public static int pegaPorDelante(int num, int digito){
        int result = (voltea(num)*10)+ digito;
        int longi = digitos(num);
        int longitudInverso = digitos(result);
        int diferencia = longi - longitudInverso;
        result = voltea(result);
        return result*(int)Math.pow(10,diferencia + 1);
    }
}

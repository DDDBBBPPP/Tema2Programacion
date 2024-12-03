package funciones;

public class Matematicas {
    public static void main(String[] args) {
        int num = 5608;
        int dig = 7;
        
        System.out.println(pegaPorDetras(num, dig));
    }

    public static int voltea(int numero) {
        int inverso = 0;
        while (numero > 0) {
            inverso = inverso * 10 + (numero % 10);
            numero = numero / 10;
        }
        return inverso;
    }

    public static boolean esCapicua(int numero) {
        return (numero == voltea(numero));
    }

    public static boolean esPrimo(int num){
        int contador = 2;
        while (contador <= (num / 2) && (num % contador) != 0) {
            contador++;
        }
        return contador>(num/2);

    }

    public static int siguienteprimo(int num){
        
        do{
            num++;
        }while(!esPrimo(num));
        return num;
    }

    public static int potencia(int base, int bucle){
           int potenciass = 1;
           for(int i = 0; i < bucle;i++){
            potenciass = potenciass*base;
           }      
        return potenciass;
    }

    public static int digitos(int num){
        int digito = 0;
        while(num>0){
            num/=10;
            digito++;
        }
        return digito;
    }

    public static int digitoEnPos(int num, int posicion){
        int longitud = digitos(num);
        for(int i = 1; i<longitud - posicion;i++){
            num/=10;
        }
        return num%10;
    }

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

    public static int pegaPorDelante(int num, int digito){
        
        
    }
}

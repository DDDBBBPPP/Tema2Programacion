package tema9poo;

public class Math {

    public static void main(String[] args) {
        System.out.println(mcd(910, 350));
    }
    /**
     * MCD RECURSIVO MAXIMO COMUN DIVISOR.
     * @param a
     * @param b
     * @return
     */
    public static int mcd(int a, int b){
        int resultado;

         if(b==0){
            resultado = a;
        }else{
            resultado = mcd(b,a%b);
        }
        return resultado;
    }


}

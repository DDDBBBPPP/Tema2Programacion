package tema9poo.ej4;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(){

    }

    public Fraccion(int num, int den) {
        this.numerador = num;
        this.denominador = den;
    }

    /**
     * Esto es pa invertir
     * 
     * @return
     */
    public Fraccion invierte() {
        Fraccion resultado = new Fraccion(this.denominador * (-1),this.numerador * (-1));

        return resultado;
    }

    /**
     * Multiplica con cada uno del lado
     * 
     * @param num
     * @param den
     * @return
     */
    public Fraccion multiplica(Fraccion ope) {
        return new Fraccion(numerador * ope.numerador,this.denominador * ope.denominador);
    }

    /**
     * Multiplica los dos por el mismo
     * 
     * @param num
     * @return
     */
    public Fraccion multiplica(int num) {
        return new Fraccion(this.numerador*num,this.denominador);
    }

    /**
     * Divide con los parametros que le pase.
     * 
     * @param num
     * @param den
     * @return
     */
    public Fraccion divideFrac(Fraccion operando) {
        return new Fraccion(this.numerador * operando.denominador, this.denominador * operando.numerador);
    }

    /**
     * Devuelve la fracción simplificada.
     * 
     * @return
     */
    public Fraccion simplifica() {
        Fraccion resultado = new Fraccion();
        int arriba = this.numerador;
        int abajo = this.denominador;
        int i = 2;
        int contador = 2;
        boolean primo = false;
        // Comprobar si tienen los mismos divisores
        while ((i <= Math.abs(arriba) / 2) && (i <= Math.abs(abajo) / 2)) {
            // aqui dividimos mientras comparten divisor.
            while((arriba % i == 0) && (abajo % i == 0)) {
                arriba = arriba/i;
                abajo = abajo/i;
            } 
                // Aqui vamos hasta el siguiente primo.
                do{
                    i++;
                    while (contador <= i / 2 && i % contador != 0){
                        contador++;
                    }
                    if (contador > i/2) {
                        primo = true;
                    }
                    contador = 2;
                }while(!primo);
                primo = false;
        }
        resultado.numerador = arriba;
        resultado.denominador = abajo;

        return resultado;
    }

    @Override
    public String toString() {

        return this.numerador + "/" + this.denominador + " ";
    }

}

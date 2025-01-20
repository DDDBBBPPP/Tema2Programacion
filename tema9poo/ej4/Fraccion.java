package tema9poo.ej4;

public class Fraccion {

    private int numerador;
    private int denominador;


    public Fraccion(int num, int den){
        this.numerador = num;
        this.denominador = den;
    }




    /**
     * Esto es pa invertir
     * @return
     */
    public String invierte(){
        int arriba;
        int abajo;

        arriba = this.denominador * (-1);
        abajo = this.numerador * (-1);


        return this + "^-1 = " + arriba + "/" + abajo;
    }



    /**
     * Multiplica con cada uno del lado
     * @param num
     * @param den
     * @return
     */
    public String multiplicaFrac(int num, int den){
        int arriba = this.numerador* num;
        int abajo = this.denominador * den;
        return this + "x " + num + "/" + den + " = " + arriba + "/" + abajo;
    }



    /**
     * Multiplica los dos por el mismo
     * @param num
     * @return
     */
    public String multiplica(int num){
        int arriba = this.numerador* num;
        int abajo = this.denominador * num;
        return this + "x " + num + " = " + arriba + "/" + abajo;
    }



    /**
     * Divide con los parametros que le pase.
     * @param num
     * @param den
     * @return
     */
    public String divideFrac(int num, int den){
        int arriba = this.numerador* den;
        int abajo = this.denominador * num;
        return this + "x " + num + "/" + den + " = " + arriba + "/" + abajo;
    }



    /**
     * Devuelve la fracción simplificada.
     * @return
     */
    public String simplifica(){
        int arriba = this.numerador;
        int abajo = this.denominador;
        int i;
        // Comprobar si tienen los mismos divisores
        return this + "= " + arriba + "/" + abajo;
    }

    @Override
    public String toString() {
        
        return this.numerador + "/" + this.denominador +  " ";
    }

}

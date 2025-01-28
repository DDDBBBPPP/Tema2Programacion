package tema9poo.pila;

public class Pila {
    // Constant
    private static final int DEFECTO = 50;

    // Propiedades
    private int[] monton;
    private int puntero; // Siempre apunta a una celda vacía.

    public Pila(){
        this.puntero = 0;
        this.monton = new int[DEFECTO];
    }

    public Pila(int tamano){
        this.puntero = 0;
        this.monton = new int[tamano];
        
    }

    public boolean esVacio(){
        return this.puntero == 0;
    }

    public void apilar(int item){

        if(!this.esLLena()){
            this.monton[this.puntero] = item;
            this.puntero++;
        }
    }

    public boolean esLLena(){
        return this.puntero == this.monton.length;
    }
    /**
     * 
     */
    public void desapilar(){
        if(!this.esVacio()){
            this.puntero--;
        }
    }


    /**
     * Te da el ultimo valor de la pila
     * @return
     */
    public int cabecera () throws ArrayIndexOutOfBoundsException{
        try{
            return this.monton[this.puntero -1 ];
        }catch(ArrayIndexOutOfBoundsException e){
            throw e;
        }
    }

}

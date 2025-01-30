package tema9poo.cola.clases;

public class Cola {
    // FIFO. FIRST IN FIRST OUT // HAY QUE HACER ESTO CON EL MAIN. EN VEZ DE CABECERA FRENTE Y COLA.

    private static final int DEFECTO = 50;

    // Propiedades
    private int[] monton;
    private int inicio; // Apunta al frente de la cola
    private int fin;    // Apunta al final de la cola
    private int tamano; // Número actual de elementos en la cola

    public Cola() {
        this.monton = new int[DEFECTO];
        this.inicio = 0;
        this.fin = -1;
        this.tamano = 0;
    }

    public Cola(int capacidad) {
        this.monton = new int[capacidad];
        this.inicio = 0;
        this.fin = -1;
        this.tamano = 0;
    }

    public boolean esVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == monton.length;
    }

    public void encolar(int item) {
        if (!estaLlena()) {
            // Aumentamos `fin` circularmente
            fin = (fin + 1) % monton.length;
            monton[fin] = item;
            tamano++;
        } else {
            throw new IllegalStateException("La cola está llena");
        }
    }

    public void desencolar() {
        if (!esVacia()) {
            // Movemos `inicio` circularmente
            inicio = (inicio + 1) % monton.length;
            tamano--;
        } else {
            throw new IllegalStateException("La cola está vacía");
        }
    }
    /**
     * En este ejemplo en concreto, PUEDES USAR NoSuchElementException!!
     * HAY QUE LANZAR EXCEPCION CUANDO PUEDE QUE NO SE DEVUELVA EL TIPO, PQ NO HAYA.
     * @return
     */
    public int frente() {
        if (!esVacia()) {
            return monton[inicio];
        } else {
            throw new IllegalStateException("La cola está vacía");
        }
    }

    public int cola() {
        if (!esVacia()) {
            return monton[fin];
        } else {
            throw new IllegalStateException("La cola está vacía");
        }
    }

}

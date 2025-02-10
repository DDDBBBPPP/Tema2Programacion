package tema10colecciones.clases;
// TIenen que ser comparables para comparar, y tienes con que comparar.
public class Gato implements Comparable<Gato>{
    private String nombre;
    private String color;
    private Integer edad; // LO hacemos wrapper. No hace falta cambiar.

    /**
     * 
     * @param nombre
     * @param color
     * @param edad
     */
    public Gato(String nombre, String color, int edad){
        this.nombre=nombre;
        this.color=color;
        this.edad=edad;

    }
    /**
     * El método que hay que implementer con la interfaz y que devuelve un entero.
     * Tenemos que hacer que devuelva -1 si El que comparamos es más pequeño que el parámetro que le metes.
     * 0 si son iguales, y 1 si el que llama al metodo es mayor al parametro.
     * @param o
     * @return
     */
    @Override
    public int compareTo(Gato o) {
        // Se puede hacer asi porque los string son comparables y tiene el método. Y TODOS LOS Wrappers
        return this.nombre.compareTo(o.nombre);
       // return this.edad.compareto(o.edad);
    }

    @Override
    public String toString() {
        return this.nombre + " es " + this.color + " y tiene " + this.edad +  " años";
    }

}

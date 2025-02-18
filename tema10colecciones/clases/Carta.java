package tema10colecciones.clases;

public class Carta implements Comparable<Carta> {

    private final String[] VALORES = { "as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey" } ;
    private final String[] PALOS = { "bastos", "copas", "oros", "espadas" } ;

    private Integer numero ;
    private String palo ;

    /** 
     * El constructor genera una carta aleatoria
     */
    public Carta() {
        this.numero = (int) (Math.random() * 10) ;
        this.palo = PALOS[ (int) (Math.random() * 4) ] ;
    }

    /**
     * @return
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @return
     */
    public String getPalo() {
        return palo;
    }

    /**
     * Comprueba si mi carta (this) y la que me pasan (obj) son o no iguales
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        
        boolean iguales = false ;

        // en primer lugar tenemos que hacer un casting del objeto que me pasan (obj)
        // y transformarlo en un objeto de tipo Carta
        Carta temporal = (Carta) obj ;

        // comparamos las cartas
        if ((this.numero == temporal.numero) && (this.palo.equals(temporal.palo))) iguales = true ;

        return iguales ;
    }

    /**
     * Se ordenarán por palo: bastos, copas, espadas y oros (alfabética en orden creciente)
     * Y por número: as (1), 2, 3, 4, 5, 6, 7 ... rey (10)
     * 
     * Devuelve:
     * -1 si mi carta (this) es menor que la otra carta
     *  0 si ambas cartas (this y otra) son iguales
     *  1 si otra carta es mayor que mi carta (this)
     * 
     * @param otra 
     * @return
     */
    @Override
    public int compareTo(Carta otra) {

        int resultado ; 

        if (this.palo.equals(otra.palo)) {
            resultado = this.numero.compareTo(otra.numero) ;
        } else {
            resultado = this.palo.compareTo(otra.palo) ;
        }

        return resultado ;
    }


    @Override
    public String toString() {        
        return VALORES[this.numero] + " de " + this.palo ;
    }
    
}
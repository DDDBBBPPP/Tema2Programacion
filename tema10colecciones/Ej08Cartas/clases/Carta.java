package tema10colecciones.Ej08Cartas.clases;

public class Carta {

    private int numero;
    private String palo;

    public Carta(int num,String palo){
        this.numero=num;
        this.palo=palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return this.numero + " de " +  this.palo;
    }
}

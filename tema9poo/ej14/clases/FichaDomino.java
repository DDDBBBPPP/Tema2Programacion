package tema9poo.ej14.clases;

public class FichaDomino {

    private int ar;
    private int ab;

    public FichaDomino(int arr, int aba){
        this.ar = arr;
        this.ab = aba;
    }

    public FichaDomino voltea(){
        int aux;
        aux = this.ar;
        this.ar = this.ab;
        this.ab = aux;

        return this;
    }

    public boolean encaja(FichaDomino f){
        return (this.ar == f.ar) || (this.ar == f.ab) || (this.ab==f.ar) || (this.ab==f.ab);
    }

    @Override
    public String toString() {
        
        return "[" + (this.ar!=0?this.ar:" ") + "|" + (this.ab!=0?this.ab:" ") + "]";
    }
}

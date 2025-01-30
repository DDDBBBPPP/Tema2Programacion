package tema9poo.ej22;

public class Disco {
    
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;


    public Disco(){

    }

    public void rellenar(){
        System.out.println();
    }

    @Override
    public String toString() {
        
        return "Código: " + this.codigo + "\nAutor: " + this.autor + 
                "\nTítulo: " + this.titulo + "\nGénero: " + this.genero + 
                "\nDuración: " + duracion;
    }


}

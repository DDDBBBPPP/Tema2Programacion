package tema9poo.ej22;

public class Disco {
    
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;


    public Disco(){

    }

    public Disco(String cod, String aut, String tit, String gen, int dur){
        this.codigo = cod;
        this.autor = aut;
        this.titulo = tit;
        this.genero = gen;
        this.duracion = dur;
    }

    

    @Override
    public String toString() {
        
        return "Código: " + this.codigo + "\nAutor: " + this.autor + 
                "\nTítulo: " + this.titulo + "\nGénero: " + this.genero + 
                "\nDuración: " + duracion;
    }


}

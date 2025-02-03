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

    public String getCodigo(){
        return this.codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        
        return "Código: " + this.codigo + "\nAutor: " + this.autor + 
                "\nTítulo: " + this.titulo + "\nGénero: " + this.genero + 
                "\nDuración: " + duracion;
    }


}

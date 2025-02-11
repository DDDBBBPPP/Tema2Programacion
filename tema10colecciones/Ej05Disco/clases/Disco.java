package tema10colecciones.Ej05Disco.clases;

public class Disco {

    private String codigo ;     // código identificativo
    private String autor ;      // artista o grupo
    private String titulo ;     // título del disco
    private String genero ;     // género 
    private int duracion ;      // duración en minutos

    /**
     * Constructor básico del disco
     * @param codigo
     * @param autor
     * @param titulo
     * @param genero
     * @param duracion
     */
    public Disco(String codigo, String autor, String titulo, 
                                       String genero, int duracion) {
        this.codigo   = codigo ;
        this.autor    = autor ;
        this.titulo   = titulo ;
        this.genero   = genero ;
        this.duracion = duracion ;
    }

    /**
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @return
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Mostramos información del disco
     * @return
     */
    @Override
    public String toString() {
        return  "Código: " + this.codigo +
                "\nAutor: " + this.autor + 
                "\nTítulo: " + this.titulo + 
                "\nGénero: " + this.genero + 
                "\nDuración: " + this.duracion ;
    }

}

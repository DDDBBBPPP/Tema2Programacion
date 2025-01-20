package tema9poo.ej2;

public class Caballo {
   private String nombre;


   public Caballo(){
    
   }
   public Caballo(String nombre){
        this.nombre = nombre;
   }

    public void trota(){
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    public void relincha(){
        System.out.println("Hiiiiiieeeeeeee");
    }
    public void come(){
        System.out.println("Ñam ñam ñam");
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Hola, me llamo: " +  this.getNombre();
    }

}

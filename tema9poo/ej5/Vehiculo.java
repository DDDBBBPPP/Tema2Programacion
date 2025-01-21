package tema9poo.ej5;

public abstract class Vehiculo {

    private static int vehiculosCreados;
    private static float kilometrosTotales;
    private float kilometrosRecorridos;

    
    public Vehiculo(){
        vehiculosCreados++;
    }

    public abstract void vacilar();

    public void anda(float kms){
        this.kilometrosRecorridos+= kms;
        kilometrosTotales+= kms;
    }

    public void comprobar(){
        System.out.printf("%s lleva recorridos %.2f kilómetros\n",(this instanceof Coche)?"El coche":"La bicicleta",this.kilometrosRecorridos);
    }

    public static float getKilometrosTotales(){
        return kilometrosTotales;
    }

}

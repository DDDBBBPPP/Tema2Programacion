package EjerciciosTema4;

public class PracticarIndentado {
    public static void main(String[] args) {
        
    
    int cm = 15000;
    float bandera = 7.00f;
    float escudo = 0.0f;
    float gastos = 3.25f;
    float total = 10.25f;

    System.out.printf("Bandera de %7d %-16s %.2f €\n", cm, "cm:", bandera);
    System.out.printf("%-35s %.2f\n", "Sin escudo:", escudo);
    System.out.printf("Gastos de envío: %.2f: \n", gastos);
    System.out.printf("Total: %.2f\n", total);

    } 
}

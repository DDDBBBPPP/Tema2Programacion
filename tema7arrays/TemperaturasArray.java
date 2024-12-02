package tema7arrays;

public class TemperaturasArray {
    private static final int DIAS = 372; // Todos meses tienen 31 dias

    public static void main(String[] args) {
        
        double suma = 0;
        double[] temperaturas = new double[DIAS];

        for(int i = 0; i < DIAS; i++){
            temperaturas[i] = (int)(Math.random()*45);
        }
        for(int i = 0; i < DIAS; i++){
            System.out.print(temperaturas[i] + " ");
        }
        //calculamos la media
        for(int i = 0; i < DIAS; i++){
            System.out.print(suma += temperaturas[i]);
        }
        //Mostramos el resultado
        System.out.printf("La media es: %.3f", suma/DIAS);

        //Mostramos los datos del mes
        System.out.println("Las temperaturas del mes son: ");
        mostrarMes(temperaturas, 12);
        

    }

/**
 * La función muestra las temperaturas de un mes dado.
 * (1 enero, 2, febrero, 3, marzo)
 * @param datos
 * @param mes
 */
    public static void mostrarMes(double[] datos, int mes){

        int ini = (mes -1)*31;
        int fin = ini + 31;

                for(;ini<fin;ini++){
                    System.out.print(datos[ini] + " ");
                }
        }
}

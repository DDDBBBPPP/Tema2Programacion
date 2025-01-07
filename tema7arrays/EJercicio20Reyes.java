package tema7arrays;

public class EJercicio20Reyes {
    public static void main(String[] args) {
        // Nombre de reyes y poniendo 1º segundo y eso
        String[] reyes;
        int i;
        int j;
        int orden = 1;

        System.out.print("Introduce la cantidad de reyes que quieres: ");
        reyes = new String[Integer.parseInt(System.console().readLine())];
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        for(i=0;i<reyes.length;i++){
            reyes[i] = System.console().readLine();
        }

        for(i = 0; i<reyes.length;i++){
            for(j = 0;j<i;j++){
                if(reyes[j].equalsIgnoreCase(reyes[i])){
                    orden++;
                }
            }
            System.out.printf("%s %do\n", reyes[i],orden);
            orden = 1;
        }
    }
}

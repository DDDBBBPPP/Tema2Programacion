package tema9poo.ej14;

import tema9poo.ej14.clases.FichaDomino;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 14
        /* FichaDomino f1 = new FichaDomino(6, 1);
        FichaDomino f2 = new FichaDomino(0, 4);
        FichaDomino f3 = new FichaDomino(3, 3);
        FichaDomino f4 = new FichaDomino(0, 1);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));

 */
        int p1 = 1;
        int p2;
        int i;
        FichaDomino[] f = new FichaDomino[8];
        boolean correcto = false;


        for(i = 0; i<8;i++){

                if(i==0){
                    p1 = random();
                    p2 = random();
                    f[i] = new FichaDomino(p1,p2);
                }else{
                    p2 = random();
                    f[i] = new FichaDomino(p1, p2);
                }
                p1 = p2;
        }

        //Lo mostramos
        mostrar(f);

    }

    public static int random(){
        return (int) (Math.random()*7);
    }

    public static void mostrar(FichaDomino[] fic){

        for(int i=0;i<fic.length;i++){
            System.out.print(fic[i]);
        }

    }

}

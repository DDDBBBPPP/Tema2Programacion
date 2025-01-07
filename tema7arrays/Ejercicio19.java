package tema7arrays;

public class Ejercicio19 {
public static void main(String[] args) {
    // RELLENAR RANDOM Y MOSTRAR
    int[] numeros = new int[12];
    int i;
    int elec;
    int pos;

    FuncionesArray.rellenarRandom(numeros, 201);
    FuncionesArray.mostrarArrayInt(numeros);

    System.out.print("Introduce el número a poner: ");
    elec = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce la posicion a quitar: ");
    pos = Integer.parseInt(System.console().readLine());


    for(i = (numeros.length -1);i > pos;i--){
        numeros[i] = numeros[i-1];
    }

    numeros[pos] = elec;

    FuncionesArray.mostrarArrayInt(numeros);
}
}

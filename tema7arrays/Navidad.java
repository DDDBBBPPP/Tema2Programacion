package tema7arrays;

public class Navidad {
        public static int[] rellenar(int[] vector, int min, int max){
    
            int num;
    
            for(int i=0; i<vector.length; i++){
                num = (int) (Math.random() * (max-min+1) + min);
                vector[i] = num;
            }
    
            return vector;
        }
    
        public static void mostrarVector(int[] vector){
            for(int i=0; i<vector.length; i++){
                if(i!=vector.length-1){
                    System.out.print(vector[i] + ", ");
                } else {
                    System.out.println(vector[i]);
                }
                
            }
        }
    
        public static long sumaAcumulativa(int[] vector){
            int suma = 0;
    
            for(int i=0; i<vector.length; i++){
                suma += vector[i];
            }
    
            return suma;
    
        }
    
        public static int[] sumarVectores(int[] a, int[] b){
            int[] result;
            result = new int[a.length];
    
            rellenar(result, 0, 0);
    
            for(int i=0; i<a.length; i++){
                result[i] = a[i] + b[i];
            }
    
            return result;
        } 
    
        public static int[] restarVectores(int[] a, int[] b){
            int[] result;
            result = new int[a.length];
    
            rellenar(result, 0, 0);
    
            for(int i=0; i<a.length; i++){
                result[i] = a[i] - b[i];
            }
    
            return result;
        } 
    
        public static int[] productoEscalar(int[] vector, int producto){
    
            for(int i=0; i<vector.length; i++){
                vector[i] = vector[i] * producto;
            }
    
            return vector;
        }
    
        public static boolean buscarElemento(int[] vector, int numero) {
            boolean result = false;
    
            for(int i=0; i<vector.length; i++){
                if(vector[i]==numero){
                    result = true;
                }
            }
    
            return result;
        }
    
        public static int calcularFrecuencia(int[] vector, int numero){
            int result = 0;
            
            for(int i=0; i<vector.length; i++){
                if(vector[i]==numero){
                    result++;
                }
            }
    
            return result;
        } 
    
        public static int maximo(int[] vector){
            int result = 0;
    
            for(int i=0; i<vector.length; i++){
                if(vector[i]>result){
                    result = vector[i];
                }
            }
    
            return result;
        }
    
        public static int minimo(int[] vector){
            int result = vector[0];
    
            for(int i=0; i<vector.length; i++){
                if(vector[i]<result){
                    result = vector[i];
                }
            }
    
            return result;
        }
    
        public static int media(int[] vector){
            int result = 0;
    
            for(int i=0; i<vector.length; i++){
                result += vector[i];
            }
    
            return result/vector.length;
        }
    
        public static int[] invertir(int[] vector){
            int[] aux;
            aux = new int[vector.length];
    
            for(int i=0; i<vector.length; i++){
                aux[vector.length-1-i] = vector[i];
            }
    
            return aux;
        }
    
        public static boolean comparar(int[] a, int[] b){
            boolean result = true;
    
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    result = false;
                }
            }
    
    
            return result;
        }
    
        public static int[] eliminarDuplicados(int[] vector){
            int cont = 0;
            for(int i=0; i<vector.length; i++){
                for(int j=0; j<vector.length; j++){
                    if(vector[i]==vector[j]){
                        cont++;
                        if(cont>1){
                            vector[j]=0;
                        }
                    }
                }
                cont = 0;
            }
            return vector;
        }
    
        public static int[] bubbleSort(int[] vector, boolean debug){
            int aux;
            boolean leave = false;
    
            while(!leave){
                leave = true;
                for(int i=0; i<vector.length-1; i++){
                    if(vector[i]>vector[i+1]){
                        aux = vector[i];
                        vector[i] = vector[i+1];
                        vector[i+1] = aux;
                        leave = false;
                    } 
                }
    
                if(debug){
                    mostrarVector(vector);
                }
            }
    
            return vector;
        }
    
    
}

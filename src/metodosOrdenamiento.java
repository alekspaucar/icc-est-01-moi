public class metodosOrdenamiento {
    public class Insercion {

        public static void ordenacionPorInsercion(int[] arreglo) {
            int n = arreglo.length;
            for (int i = 1; i < n; ++i) {
                int clave = arreglo[i];
                int j = i - 1;
    
                /* Mueve los elementos del arreglo [0..i-1], que son
                   mayores que la clave, a una posición hacia adelante */
                while (j >= 0 && arreglo[j] > clave) {
                    arreglo[j + 1] = arreglo[j];
                    j = j - 1;
                }
                arreglo[j + 1] = clave;
            }
        }
    
        public static void main(String args[]) {
            int arreglo[] = {12, 11, 13, 5, 6};
            ordenacionPorInsercion(arreglo);
    
            // Imprimimos el arreglo ordenado
            for (int i = 0; i < arreglo.length; ++i)
                System.out.print(arreglo[i] + " ");
        }
    }
}

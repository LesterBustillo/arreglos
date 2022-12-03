
package arreglos;

class Arreglos {

    public static void main(String[] args) {
        int arreglo1[][]  = {{1, 2, 3}, {4, 5, 6}};
        int arreglo2[][]  = {{1, 2}, {3}, {4, 5, 6}};
        int arreglo3[][]  = {{1, 2,5}, {3,6}, {4, 6}};

          System.out.println("Los Valores en arreglo1 por fila son");
         imprimirArreglo(arreglo1); // kjk
         System.out.println("Los Valores en arreglo2 por fila son");
         imprimirArreglo(arreglo2);
         System.out.println("Los Valores en arreglo3 por fila son");
         imprimirArreglo(arreglo3);
    }
    static void imprimirArreglo(int[][] arreglo){
       for (int fila = 0; fila < arreglo.length; fila++){
          for (int columna = 0; columna < arreglo[fila].length; columna++){
            System.out.print( arreglo[fila][columna]+"\t");
 } 
            System.out.println();
        } 
     }
}

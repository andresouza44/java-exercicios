package arrays;

/**
 * <a href="https://www.javatpoint.com/java-program-to-sort-the-elements-of-an-array-in-ascending-order">Ordenando Elementos de uma Array</a>
 *
 */

public class OrdenandoElementos {
    public static void main(String[] args) {
        int [] arr =  {5, 2, 8, 7, 1};

        int temp;
        for (int i=0 ;i <arr.length;i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr [j]){
                    temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp;
                }
            }
        }
        for ( int numero : arr) System.out.println(numero);
        System.out.println(arr[2] +" é o terceiro maior número");
        }

}

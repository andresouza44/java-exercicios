package arrays;
/**
 * <a href = "https://www.javatpoint.com/java-program-to-right-rotate-the-elements-of-an-array">Rotacionar os elementos de uma Array para Direita</a>
 *In this program, we need to rotate the elements of an array towards the right by the specified number of times.
 *  In the right rotation, each element of the array will be shifted to its right by one position and
 *  the first element of the array will be added to end of the list. This process will be followed for a specified number of times.
 * */

public class RightRotate {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int [] arrayRight = array;
        int n = 3; // numero de rotaçao
        for (int i =1;i<=n; i++)
            arrayRight = Rotacao(arrayRight);

        System.out.println("Array Original:");
        for ( int numero: array) {
            System.out.print(numero+"\t");
        }
        System.out.println("\nArray depois do Right Rotation:");
        for ( int numero: arrayRight) {
            System.out.print(numero+"\t");
        }

    }
    private static int [] Rotacao (int [] array) {
        int [] arrayRight = new int[array.length];
        for (int i = 0 ; i <= array.length-1; i++) {
            if (i != array.length-1) {
                arrayRight[i+1] = array[i];
            } else {
                arrayRight[0] = array[i];
            }
        }

        return arrayRight;
    }



}

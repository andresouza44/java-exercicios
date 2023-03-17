package arrays;

/**
 * <a href = "https://www.javatpoint.com/java-program-to-left-rotate-the-elements-of-an-array">Rotacionar os elementos de uma Array para Esquerda</a>
 *In this program, we need to rotate the elements of an array towards the left by the specified number of times.
 *  In the left rotation, each element of the array will be shifted to its left by one position and
 *  the first element of the array will be added to end of the list. This process will be followed for a specified number of times.
 * */

public class LeftRotate {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int [] arrayLeft = array;
        int n = 3; // numero de rotaçao
        for (int i =1;i<=n; i++)
            arrayLeft = Rotacao(arrayLeft);

        System.out.println("Array Original:");
        for ( int numero: array) {
            System.out.print(numero+"\t");
        }
        System.out.println("\nArray depois do Left Rotation:");
        for ( int numero: arrayLeft) {
            System.out.print(numero+"\t");
        }

    }
    private static int [] Rotacao (int [] array) {
        int [] arrayLeft = new int[array.length];
            for (int i = array.length - 1; i >= 0; i--) {
                if (i != 0) {
                    arrayLeft[i - 1] = array[i];
                } else {
                    arrayLeft[array.length - 1] = array[i];
                }
            }

        return arrayLeft;
    }


}

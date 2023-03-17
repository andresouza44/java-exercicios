package arrays;

/**
 * <a href = "https://www.javatpoint.com/java-program-to-find-the-frequency-of-each-element-in-the-array">Frequencia de um Elemento</a>
 *In this program, we have an array of elements to count the occurrence of its each element.
 * One of the approaches to resolve this problem is to maintain one array to store the counts of each element of the array.
 * Loop through the array and count the occurrence of each element as frequency and store it in another array fr.
 */

public class FrequanciaElemento {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] arrayFrequencia = new int[array1.length];
        int count = 1;
        int conferido = -1;

        for (int i = 0; i < array1.length; i++) {
            count = 1;
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    count++;
                    arrayFrequencia[j] = conferido;
                }
            }
            if (arrayFrequencia[i] != conferido) {
                arrayFrequencia[i] = count;
                System.out.println(array1[i] + " Frequencia: " + arrayFrequencia[i]);
            }
        }
    }
}

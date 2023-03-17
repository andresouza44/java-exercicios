package arrays;

/**
 * <a href="https://www.javatpoint.com/java-program-to-print-the-largest-element-in-an-array">Maior Número em um Array</a>
 *In this program, we need to find out the largest element present in the array and display it
 */
public class MaiorNumero {
    public static void main(String[] args) {
        int [] arr = {25, 11, 7, 75, 56};
        int maiorNumero = 0;
        for (int i : arr){
             if (i>=maiorNumero) {
                 maiorNumero = i;
             }
        }
        System.out.println("Maior Elemento do array: "+ maiorNumero);
    }
}



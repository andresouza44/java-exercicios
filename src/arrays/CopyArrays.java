package arrays;
/**
 * <a href = "https://www.javatpoint.com/java-program-to-copy-all-elements-of-one-array-into-another-array">Array</a>
 In this program, we need to copy all the elements of one array into another
 */

public class CopyArrays {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = new int [array1.length];
        for (int i=0; i<array1.length; i++){
            array2[i] = array1[i];
            System.out.print("Array2 :" + array2[i]+"\t");
            }
        }
}


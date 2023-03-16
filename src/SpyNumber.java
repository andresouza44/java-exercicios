import java.util.Scanner;

/**
 * <a href="https://beginnersbook.com/2022/06/spy-number-in-java-with-example/">.Spy Number..</a>
 * A number is called spy number if the sum of its digits is equal to the product of its digits.
 * <p>Ler um número e Determinar se é um SpyNunber.</p>
 *
 */

public class SpyNumber {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int somaNumeroDigitos = 0;
        int somaProdutoDigitos = 1;

        System.out.println();
        while (numero > 0) {
            somaNumeroDigitos += numero % 10;
            somaProdutoDigitos *= numero % 10;
            numero /=10;
        }
        if (somaNumeroDigitos==somaProdutoDigitos){
            System.out.println("É um Spy Number");
        }else {
            System.out.println("Não um Spy Number");
        }

    }



}

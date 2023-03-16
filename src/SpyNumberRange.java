import java.util.Scanner;

/**
 ***
 *  * <a href="https://beginnersbook.com/2022/06/spy-number-in-java-with-example/">.Spy Number..</a>
 *  * A number is called spy number if the sum of its digits is equal to the product of its digits.
 *  * <p>Ler um Range e determinar todos os SpyNunber.</p>
 *  *
 *  */

public class SpyNumberRange {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número inicial: ");
        int numeorInicial = leitor.nextInt();
        System.out.println("Digite o número Final: ");
        int numeorFinal = leitor.nextInt();

        for (int i = numeorInicial; i <= numeorFinal; i++) {
            VerificarSpyNumber(i);
        }

    }

    private static void VerificarSpyNumber (int numero){
        int numeroAuxiliar = numero;
        int somaNumeroDigitos = 0;
        int somaProdutoDigitos =1;

        while (numeroAuxiliar > 0) {
            somaNumeroDigitos += numeroAuxiliar % 10;
            somaProdutoDigitos *= numeroAuxiliar % 10;
            numeroAuxiliar /= 10;
        }
        if (somaNumeroDigitos == somaProdutoDigitos) {
            System.out.println(numero + " é um Spy Number");
        }
        return;
    }

}

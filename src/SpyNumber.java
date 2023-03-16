import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int somaNumeroDigitos = 0;
        int somaProdutoDigitos = 1;

        System.out.println();
        while (numero > 0) {
            somaNumeroDigitos += numero % 10;
            if (numero % 10 != 0) {
                somaProdutoDigitos *= numero % 10;
            }
            numero /=10;
        }
        if (somaNumeroDigitos==somaProdutoDigitos){
            System.out.println("É um SpyNumber");
        }else {
            System.out.println("Não um SpyNumber");
        }

    }



}

package varargs;

/**
 * Crie um método que receba uma quantidade variável de números inteiros e retorne o menor valor
 4.Escreva um método que receba uma quantidade variável de objetos e retorne uma lista com eles.

*/
public class Varargs01 {
    public static void main(String[] args) {
        menorValor(1,2,3,-3,0,-3.5);
        menorValor(1,2,3,0,3);
        menorValor(-3,0,-4.5,5);

    }
    public static void  menorValor( double ... numeros){
        double menor = numeros[0];
        for (double numero: numeros) {
            if (numero<menor){
                menor = numero;
            }
        }
        System.out.println("O menor valor da lista é o número " + menor);
    }

}

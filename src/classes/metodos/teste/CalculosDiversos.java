package classes.metodos.teste;
/*
Sugestões do Chat GPT
 */
import classes.metodos.domain.CalculaMedia;

public class CalculosDiversos {
    public static void main(String[] args) {
        CalculaMedia calculaMedia = new  CalculaMedia();
        calculaMedia.setNumero1(5);
        calculaMedia.setNumero2(10);
        calculaMedia.setNumero3(5);

        System.out.printf("\n%.4f",calculaMedia.MediaTresNumeros());

        System.out.println("\n-----------------------------------");
        int numero = 15;
        String tipo = parImpar(numero);
        System.out.println("O número "+numero+" é "+tipo);
    }




//Escreva um método que receba um número inteiro como parâmetro e verifique se é par ou ímpar.
    public static String parImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par!";
        }
        return "Impar!";

    }

}




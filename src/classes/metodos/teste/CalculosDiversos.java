package classes.metodos.teste;
/*
Sugest�es do Chat GPT
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
        System.out.println("O n�mero "+numero+" � "+tipo);
    }




//Escreva um m�todo que receba um n�mero inteiro como par�metro e verifique se � par ou �mpar.
    public static String parImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par!";
        }
        return "Impar!";

    }

}




package varargs;

//Crie um m�todo que receba uma quantidade vari�vel de n�meros e retorne a m�dia aritm�tica

public class Varargs02 {
    public static void main(String[] args) {
        MediaNumeros(5,6,10,7,5,-3,55.5);

    }

 public static void MediaNumeros(double... numeros) {
        double soma=0;
        for (double numero: numeros){
            soma += numero;
        }
            double media = soma/ numeros.length;
     System.out.printf(" A m�dia dos np�meros � %.2f",media);
    }

}

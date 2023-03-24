package varargs;

//Crie um método que receba uma quantidade variável de números e retorne a média aritmética

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
     System.out.printf(" A média dos npúmeros é %.2f",media);
    }

}

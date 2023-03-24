package classes.metodos.domain;


public class CalculaMedia {
    private double numero1;
    private double numero2;
    private double numero3;


    public double MediaTresNumeros(){
        double media = (this.numero1 + this.numero2 + this.numero3)/3;
        return  media;

    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }
}

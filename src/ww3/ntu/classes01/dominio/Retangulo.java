package ww3.ntu.classes01.dominio;

public class Retangulo {
    private float largura;
    private float comprimento;

    public Retangulo() {
        this.largura = 1;
        this.comprimento = 1;

    }

    public Retangulo(float largura, float comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public float CalculaArea() {
        return this.comprimento*this.largura;
        }

    public float CalculaPerimetro(){
        return 2*this.largura + 2*this.comprimento;

    }


    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", comprimento=" + comprimento +
                '}';
    }
}

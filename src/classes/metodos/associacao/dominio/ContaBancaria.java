package classes.metodos.associacao.dominio;

public class ContaBancaria {
    private int saldo;
    private int contaNumero;

    public ContaBancaria(int saldo, int contaNumero) {
        this.saldo = saldo;
        this.contaNumero = contaNumero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getContaNumero() {
        return contaNumero;
    }

    public void setContaNumero(int contaNumero) {
        this.contaNumero = contaNumero;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "saldo=" + saldo +
                ", contaNumero=" + contaNumero +
                '}';
    }
}


package classes.metodos.associacao.dominio;

public class Pedido {
    private int numero;
    private String cliente;
    private Produto[] produtos;

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public Pedido(int numero, String cliente, Produto[] produtos) {
        this.numero = numero;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public void imprimir() {
        System.out.println("Cliente: " + this.cliente + ", Pedido N: " + this.numero);
        if (produtos == null) return;
        for (Produto produto : produtos) {
            System.out.println( produto.getNome() +" R$:" + produto.getPreco());
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
}

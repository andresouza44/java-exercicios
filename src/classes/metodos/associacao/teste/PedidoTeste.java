package classes.metodos.associacao.teste;

import classes.metodos.associacao.dominio.Cliente;
import classes.metodos.associacao.dominio.Pedido;
import classes.metodos.associacao.dominio.Produto;

/**
 * Crie uma classe "Produto" que tenha os atributos "nome" e "preco".
 * Crie uma classe "Pedido" que tenha os atributos "numero" e "cliente".
 * Associe a classe "Produto" com a classe "Pedido" de forma que um pedido possa ter vários produtos.
 *
 */

public class PedidoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Play5", 4599);
        Produto produto2 = new Produto("TV 8K", 8999);

        Pedido pedido1 = new Pedido(100, "Andre");

        Produto [] produtos = {produto1,produto2};
        System.out.println(produto1);
        pedido1.setProdutos(produtos);
        pedido1.imprimir();

    }
}

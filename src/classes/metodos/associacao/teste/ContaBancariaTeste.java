package classes.metodos.associacao.teste;

import classes.metodos.associacao.dominio.Cliente;
import classes.metodos.associacao.dominio.ContaBancaria;

/**
 * Crie uma classe "ContaBancaria" que tenha os atributos "saldo" e "numero".
 * Crie uma classe "Cliente" que tenha os atributos "nome" e "cpf".
 * Associe a classe "ContaBancaria" com a classe "Cliente" de forma que um cliente possa ter várias contas bancárias
 */

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1500,40532);
        ContaBancaria conta2 = new ContaBancaria(-100,35488);

        ContaBancaria [ ] contas = {conta1,conta2};

        Cliente cliente1 = new Cliente("andre", "172.666.724-27",contas);
        System.out.println(cliente1);

        conta2.setSaldo(200);
        System.out.println(conta2.getSaldo());


    }
}

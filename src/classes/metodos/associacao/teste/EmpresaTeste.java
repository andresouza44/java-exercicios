package classes.metodos.associacao.teste;

import classes.metodos.associacao.dominio.Empresa;
import classes.metodos.associacao.dominio.Pessoa;

public class EmpresaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("André",52);
        Empresa empresa1 = new Empresa("65.88.352.0001-20");

        System.out.println(pessoa1);
        empresa1.setPessoa(pessoa1);
        System.out.println(empresa1);

        System.out.println(empresa1.getPessoa());
        System.out.println(empresa1.getPessoa().getNome());
        System.out.println(empresa1.getPessoa().getIdade());

    }
}

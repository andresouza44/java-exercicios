package classes.metodos.associacao.dominio;

/**
 * 1.	Crie uma classe "Pessoa" que tenha os atributos "nome" e "idade".
 * Crie uma classe "Empresa" que tenha os atributos "nome" e "cnpj".
 * Associe a classe "Pessoa" com a classe "Empresa" de forma que uma pessoa possa trabalhar em uma empresa
 */

public class Empresa {
    private String cnpj;
    private Pessoa pessoa;

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa(String cnpj, Pessoa pessoa) {
        this.cnpj = cnpj;
        this.pessoa = pessoa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String  toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}

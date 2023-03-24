
    public class ExemploInicializacao {
        static int valorEstatico;
        int valorInstancia;

        // Bloco de inicialização estático
        static {
            valorEstatico = 5;
        }

        // Bloco de inicialização de instância
        {
            valorInstancia = valorEstatico * 2;
        }

        // Método para imprimir o valor da variável de instância
        public void imprimeValor() {
            System.out.println("O valor da variável de instância é " + valorInstancia);
        }

        public static void main(String[] args) {
            ExemploInicializacao exemplo = new ExemploInicializacao();
            exemplo.imprimeValor();
        }
    }



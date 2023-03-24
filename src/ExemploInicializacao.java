
    public class ExemploInicializacao {
        static int valorEstatico;
        int valorInstancia;

        // Bloco de inicializa��o est�tico
        static {
            valorEstatico = 5;
        }

        // Bloco de inicializa��o de inst�ncia
        {
            valorInstancia = valorEstatico * 2;
        }

        // M�todo para imprimir o valor da vari�vel de inst�ncia
        public void imprimeValor() {
            System.out.println("O valor da vari�vel de inst�ncia � " + valorInstancia);
        }

        public static void main(String[] args) {
            ExemploInicializacao exemplo = new ExemploInicializacao();
            exemplo.imprimeValor();
        }
    }



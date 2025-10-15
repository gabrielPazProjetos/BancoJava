// Classe abstrata que serve como base para diferentes tipos de conta
public abstract class Conta {
    protected double saldo;
    protected Cliente cliente;
    protected int numero;
    private static int contador = 1;

    // Construtor que associa a conta ao cliente e gera um número único
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numero = contador++;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar dinheiro da conta, com verificação de saldo
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Método para imprimir informações básicas da conta
    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}

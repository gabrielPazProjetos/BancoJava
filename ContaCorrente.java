// Classe que representa uma conta corrente, herda da classe Conta
public class ContaCorrente extends Conta {

    // Construtor que chama o construtor da classe base
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    // Sobrescrita do método para imprimir extrato específico da conta corrente
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}

// Classe que representa uma conta poupança, herda da classe Conta
public class ContaPoupanca extends Conta {

    // Construtor que chama o construtor da classe base
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Sobrescrita do método para imprimir extrato específico da conta poupança
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}

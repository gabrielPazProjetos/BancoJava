// Classe principal que executa o programa do banco digital
public class Main {
    public static void main(String[] args) {
        // Cria um cliente com nome "Gabriel"
        Cliente cliente = new Cliente("Gabriel");

        // Cria uma conta corrente e uma conta poupança para o cliente
        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

        // Realiza depósitos nas contas
        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);

        // Realiza saques nas contas
        contaCorrente.sacar(200);
        contaPoupanca.sacar(100);

        // Imprime os extratos das contas
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}

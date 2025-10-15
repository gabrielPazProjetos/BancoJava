public class Main {
    public static void main(String[] args) {
        // Cria um cliente
        Cliente cliente = new Cliente("Gabriel");

        // Cria contas para o cliente
        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca cp = new ContaPoupanca(cliente);

        // Realiza operações
        cc.depositar(1000);
        cp.depositar(500);

        cc.sacar(200);
        cp.sacar(100);

        // Exibe extratos
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

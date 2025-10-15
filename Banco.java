import java.util.ArrayList;
import java.util.List;

// Classe que representa o banco e gerencia suas contas
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    // Construtor que define o nome do banco
    public Banco(String nome) {
        this.nome = nome;
    }

    // Método para adicionar uma conta ao banco
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para listar todas as contas do banco
    public void listarContas() {
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
}

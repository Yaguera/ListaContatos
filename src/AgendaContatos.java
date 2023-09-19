import java.util.HashMap;
import java.util.Scanner;

public class AgendaContatos {
    private HashMap<String, Contato> agenda;

    public AgendaContatos() {
        agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone, String nascimento, String email, String celular) {
        Contato contato = new Contato(nome, telefone, nascimento, email, celular);
        agenda.put(nome, contato);
    }

    public void excluirContato(String nome) {
        agenda.remove(nome);
    }

    public Contato pesquisarContato(String nome) {
        return agenda.get(nome);
    }

    public void exibirListaContatos() {
        for (Contato contato : agenda.values()) {
            System.out.println("\t");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Nascimento: " + contato.getNascimento());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Celular: " + contato.getCelular());
            System.out.println("--------------------");
        }
    }
}
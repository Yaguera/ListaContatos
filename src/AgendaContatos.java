import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class AgendaContatos {
	
	Scanner scanner = new Scanner(System.in);
	
    private HashMap<String, Contato> agenda;

    public AgendaContatos() {
        agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone, LocalDate nascimento, String email, String celular) {
        Contato contato = new Contato(nome, telefone, nascimento, email, celular);
        agenda.put(nome, contato);
    }

    public void excluirContato(String nome) {
    	System.out.println("Tem certeza que deseja excluir o contato " + nome + " ? (S/N)");
    	char resposta = scanner.nextLine().charAt(0);
    	if(resposta == 'S') {
    		agenda.remove(nome);
            System.out.println("Contato " + nome + " excluido com sucesso.");
            System.out.println("--------------------");
            System.out.println();
    	}
    	
    }

    public Contato pesquisarContato(String nome) {
        return agenda.get(nome);
    }

    public void exibirListaContatos() {
    	System.out.println();
    	System.out.println("+--------------------+");
    	System.out.println("| Lista de Contatos: |");
    	System.out.println("+--------------------+");
        for (Contato contato : agenda.values()) {
            System.out.println(contato);
        }
        System.out.println();
    }
}
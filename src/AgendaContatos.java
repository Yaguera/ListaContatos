import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class AgendaContatos {
	
	Scanner scanner = new Scanner(System.in);
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
    private HashMap<String, Contato> agenda;

    public AgendaContatos() {
        agenda = new HashMap<>();
    }

    public void adicionarContato() {
    	System.out.println();
        System.out.println("+-----------------------------+");
    	System.out.println("|      Adicionar contato      |");
        System.out.println("+-----------------------------+");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        LocalDate nascimento = LocalDate.parse(scanner.next(), dtf);
        System.out.print("Telefone: ");
        scanner.nextLine();
        String telefone = scanner.nextLine();
        System.out.print("Celular: ");
        String celular = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
    	System.out.println();
    	System.out.println("Contato " + nome + " foi salvo com sucesso.");
    	System.out.println();
        agenda.put(nome, new Contato(nome, nascimento, telefone, celular, email));
    }

    public void excluirContato() {
    	System.out.println();
        System.out.println("+-----------------------------+");
    	System.out.println("|       Excluir contato       |");
        System.out.println("+-----------------------------+");
        System.out.print("Nome do contato a ser excluído: ");
        String nomeExcluir = scanner.nextLine();
        if(agenda.get(nomeExcluir) == null) {
            System.out.println("Contato não encontrado.");
        } else {
	    	System.out.print("Tem certeza que deseja excluir o contato " + nomeExcluir + " (S/N)? ");
	    	char resposta = scanner.nextLine().toUpperCase().charAt(0);
	    	System.out.println();
	    	if(resposta == 'S') {
	    		agenda.remove(nomeExcluir);
	            System.out.println("Contato " + nomeExcluir + " excluido com sucesso.");
	    	}
        }
        System.out.println();
    }

    public void pesquisarContato() {
    	System.out.println();
        System.out.println("+-----------------------------+");
    	System.out.println("|      Pesquisar contato      |");
        System.out.println("+-----------------------------+");
        System.out.print("Nome do contato a ser pesquisado: ");
        String nomePesquisar = scanner.nextLine();
        if (agenda.get(nomePesquisar) == null) {
            System.out.println("Contato não encontrado.");
        } else {
        	System.out.println();
        	System.out.println("+-----------------------------+");
        	System.out.println(agenda.get(nomePesquisar));
        }
        System.out.println();
    }

    public void exibirListaContatos() {
        if(agenda.isEmpty()) {
        	System.out.println("Lista de contato esta vazia.");
        } else {
	    	System.out.println();
	    	System.out.println("+--------------------+");
	    	System.out.println("| Lista de Contatos: |");
	    	System.out.println("+--------------------+");
	    	for (Contato contato : agenda.values()) {
	            System.out.println(contato);
	        }
        }
        System.out.println();
    }
    
    public void encerrarAgenda() {
    	System.out.println();
    	System.out.println("+------------------------+");
        System.out.println("|    Agenda encerrada    |");
    	System.out.println("+------------------------+");
        System.exit(0);
    }
}
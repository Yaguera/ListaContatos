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
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Nascimento: ");
        LocalDate nascimento = LocalDate.parse(scanner.next(), dtf);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Celular: ");
        String celular = scanner.nextLine();
    	System.out.println();
    	System.out.println("Contato " + nome + " foi salvo com sucesso.");
    	System.out.println();
        agenda.put(nome, new Contato(nome, telefone, nascimento, email, celular));
    }

    public void excluirContato() {
    	System.out.println();
        System.out.println("+-----------------------------+");
    	System.out.println("|       Excluir contato       |");
        System.out.println("+-----------------------------+");
        System.out.print("Nome do contato a ser excluído: ");
        String nomeExcluir = scanner.nextLine();
    	System.out.print("Tem certeza que deseja excluir o contato " + nomeExcluir + " (S/N)? ");
    	char resposta = scanner.nextLine().charAt(0);
    	System.out.println();
    	if(resposta == 'S') {
    		agenda.remove(nomeExcluir);
            System.out.println("Contato " + nomeExcluir + " excluido com sucesso.");
            System.out.println("+-----------------------------+");
    	}
    	System.out.println();
    }

    public Contato pesquisarContato() {
    	System.out.println();
        System.out.println("+-----------------------------+");
    	System.out.println("|      Pesquisar contato      |");
        System.out.println("+-----------------------------+");
        System.out.print("Nome do contato a ser pesquisado: ");
        String nomePesquisar = scanner.nextLine();
        if (nomePesquisar != null) {
        	//System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
        return agenda.get(nomePesquisar);
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
    
    public void encerrarAgenda() {
    	System.out.println();
    	System.out.println("+------------------------+");
        System.out.println("|    Agenda encerrada    |");
    	System.out.println("+------------------------+");
        System.exit(0);
    }
}
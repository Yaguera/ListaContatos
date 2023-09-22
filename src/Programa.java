import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaContatos agenda = new AgendaContatos();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
        	System.out.println("+-----------------------------+");
        	System.out.println("|           Agenda:           |");
        	System.out.println("+-----------------------------+");
            System.out.println("| 1. Adicionar Contato        |");
            System.out.println("| 2. Excluir Contato          |");
            System.out.println("| 3. Pesquisar Contato        |");
            System.out.println("| 4. Exibir Lista de Contatos |");
            System.out.println("| 5. Sair                     |");
            System.out.println("+-----------------------------+");
            System.out.print("  Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("+-----------------------------+");

            switch (opcao) {
                case 1:
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
                    agenda.adicionarContato(nome, telefone, nascimento, email, celular);
                    break;
                case 2:
                    System.out.print("Nome do contato a ser excluído: ");
                    String nomeExcluir = scanner.nextLine();
                    agenda.excluirContato(nomeExcluir);
                    break;
                case 3:
                    System.out.print("Nome do contato a ser pesquisado: ");
                    String nomePesquisar = scanner.nextLine();
                    Contato contatoEncontrado = agenda.pesquisarContato(nomePesquisar);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado:");
                        System.out.println("Nome: " + contatoEncontrado.getNome());
                        System.out.println("Telefone: " + contatoEncontrado.getTelefone());
                        System.out.println("Nascimento: " + contatoEncontrado.getNascimento());
                        System.out.println("Email: " + contatoEncontrado.getEmail());
                        System.out.println("Celular: " + contatoEncontrado.getCelular());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    agenda.exibirListaContatos();
                    break;
                case 5:
                    System.out.println("Encerrando a aplicação.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        } 
    }
}
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
            System.out.println("Nome: " + contato.nome);
            System.out.println("Telefone: " + contato.telefone);
            System.out.println("Nascimento: " + contato.nascimento);
            System.out.println("Email: " + contato.email);
            System.out.println("Celular: " + contato.celular);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaContatos agenda = new AgendaContatos();

        while (true) {
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Excluir Contato");
            System.out.println("3. Pesquisar Contato");
            System.out.println("4. Exibir Lista de Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Nascimento: ");
                    String nascimento = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
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
                        System.out.println("Nome: " + contatoEncontrado.nome);
                        System.out.println("Telefone: " + contatoEncontrado.telefone);
                        System.out.println("Nascimento: " + contatoEncontrado.nascimento);
                        System.out.println("Email: " + contatoEncontrado.email);
                        System.out.println("Celular: " + contatoEncontrado.celular);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de Contatos:");
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
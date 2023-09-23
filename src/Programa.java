import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaContatos agenda = new AgendaContatos();

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
                    agenda.adicionarContato();
                    break;
                case 2:
                    agenda.excluirContato();
                    break;
                case 3:
                	agenda.pesquisarContato();
                    break;
                case 4:
                    agenda.exibirListaContatos();
                    break;
                case 5:
                	agenda.encerrarAgenda();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println();
            }
        } 
    }
}
package controlers;
import models.GerenciadorDeTarefas;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
    private Scanner scanner;
    private int requisicaoMenu;
    GerenciadorDeTarefas gerenciador;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.requisicaoMenu = requisicaoMenu;
        this.gerenciador = new GerenciadorDeTarefas();
    }

    public void exibirMenu(){
        while (true){
            try {
                System.out.println("====================================");
                System.out.println("             TODO LIST");
                System.out.println("====================================");
                System.out.println();
                System.out.println("[1] Exibir lista de tarefas.");
                System.out.println("[2] Adiconar tarefas.");
                System.out.println("[3] Marcar como concluido.");
                System.out.println("[4] Remover tarefa.");
                System.out.println("[5] Sair.");
                System.out.println();
                System.out.println("Escolha uma opção: ");
                setRequisicaoMenu(scanner.nextInt());

                if (requisicaoMenu == 1) {
                    gerenciador.listarTarefas();
                } else if (requisicaoMenu == 2) {
                    gerenciador.adiconarTarefa();
                } else if (requisicaoMenu == 3) {
                    gerenciador.marcarComoConcluido();
                } else if (requisicaoMenu == 4) {
                    gerenciador.removerTarefa();
                } else if (requisicaoMenu == 5) {
                    System.out.println("Até a próxima.");
                    System.out.println("Fechando...");
                    break;
                }else {
                    System.out.println("Digite somente um número do menu.");
                }
            } catch (InputMismatchException e ){
                System.out.println("Digite apenas números, por favor!.");
                scanner.next();
            }

        }

    }

    public int getRequisicaoMenu() {
        return requisicaoMenu;
    }

    public void setRequisicaoMenu(int requisicaoMenu) {
        this.requisicaoMenu = requisicaoMenu;
    }
}

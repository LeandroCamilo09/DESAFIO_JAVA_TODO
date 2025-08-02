package controlers;
import models.GerenciadorDeTarefas;

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
        System.out.println("====================================");
        System.out.println("             TODO LIST");
        System.out.println("====================================");
        System.out.println();
        System.out.println("[1] Exibir lista de tarefas.");
        System.out.println("[2] Adiconar tarefas.");
        System.out.println("[3] Marcar como concluido.");
        System.out.println("[4] Remover tarefa.");
        System.out.println();
        System.out.println("Escolha uma opção: ");
        setRequisicaoMenu(scanner.nextInt());

        if (requisicaoMenu == 1) {
            gerenciador.listarTarefas();
        } else if (requisicaoMenu == 2) {
            gerenciador.adiconarTarefa();
            gerenciador.listarTarefas();
        }
        scanner.close();
    }

    public int getRequisicaoMenu() {
        return requisicaoMenu;
    }

    public void setRequisicaoMenu(int requisicaoMenu) {
        this.requisicaoMenu = requisicaoMenu;
    }
}

package models;

import controlers.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

//TODO: Criar metodos

public class GerenciadorDeTarefas {
    private Scanner scanner;
    public String titulo;
    public String descricao;

    private ArrayList<Tarefa> listaDeTarefas;

    public GerenciadorDeTarefas() {
        this.scanner = new Scanner(System.in);
        this.titulo = titulo;
        this.descricao = descricao;
        this.listaDeTarefas = new ArrayList<Tarefa>();
    }

    public Scanner getScanner() {

        return scanner;
    }

    public void setScanner(Scanner scanner) {

        this.scanner = scanner;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public ArrayList getListaDeTarefas() {

        return listaDeTarefas;
    }

    public void setListaDeTarefas(ArrayList listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void adiconarTarefa(){
        System.out.println("Digite o título da terefa: " );
        setTitulo(scanner.nextLine());
        System.out.println("Tarefa adiconada com sucesso");
        System.out.println("Descreva sua tarefa: ");
        setDescricao(scanner.nextLine());
        System.out.println("Descrição adiconada com sucesso" );
        scanner.close();
        Tarefa NovaTarefa = new Tarefa(listaDeTarefas.size(),getTitulo(),getDescricao());
        listaDeTarefas.add(NovaTarefa);
        System.out.println("Tarefa adiconada com sucesso");
    }

    public void listarTarefas(){
        System.out.println("=========================================");
        System.out.println("            LISTA DE TAREFAS");
        System.out.println("=========================================");
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println("["
                            + listaDeTarefas.get(i).getId()+"] "
                            + listaDeTarefas.get(i).getTitulo() + ": "
                            + listaDeTarefas.get(i).getDescricao()
            );
        }
    }
}

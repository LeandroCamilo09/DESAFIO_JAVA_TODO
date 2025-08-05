package models;

import controlers.SituacaoEnnum;
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

    public void listarTarefas(){
        System.out.println("=========================================");
        System.out.println("            LISTA DE TAREFAS");
        System.out.println("=========================================");
        if (listaDeTarefas.size()==0){
            System.out.println("NENHUMA TAREFA ADICIONADA NO MOMENTO.");
        }
        else {
            for (int i = 0; i < listaDeTarefas.size(); i++) {
                System.out.println("ID: "
                                + listaDeTarefas.get(i).getId()+" | TÍTULO:"
                                + listaDeTarefas.get(i).getTitulo() + " | DESCRIÇÃO: "
                                + listaDeTarefas.get(i).getDescricao() + " | SITUAÇÃO: "
                                + listaDeTarefas.get(i).getConcluida()
                );
            }
        }
    }

    public void adiconarTarefa(){
        System.out.println("Digite o título da terefa: " );
        setTitulo(scanner.nextLine());
        System.out.println("Tarefa adiconada com sucesso");
        System.out.println("Descreva sua tarefa: ");
        setDescricao(scanner.nextLine());
        System.out.println("Descrição adiconada com sucesso" );
        Tarefa NovaTarefa = new Tarefa(listaDeTarefas.size(),getTitulo(),getDescricao());
        listaDeTarefas.add(NovaTarefa);
        System.out.println("Tarefa adiconada com sucesso");
    }

    public void marcarComoConcluido(){
        listarTarefas();
        System.out.println("Digite o ID do item que deseja concluir: ");
        int idTarefaAConcluir=scanner.nextInt();

        listaDeTarefas.get(idTarefaAConcluir).setConcluida(SituacaoEnnum.CONCLUIDO);

        System.out.println("Tarefa concluida com sucesso.");
        System.out.println();
    }

    public void removerTarefa(){
        listarTarefas();
        System.out.println("Digite o ID do item que deseja exluir: ");
        int idTarefaDeletae=scanner.nextInt();

        listaDeTarefas.remove(idTarefaDeletae);
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            listaDeTarefas.get(i).setId(i);
        }

        System.out.println("Tarefa removida com sucesso.");
        System.out.println();

    }

}

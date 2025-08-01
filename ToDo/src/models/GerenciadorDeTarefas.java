package models;

import controlers.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    private Scanner scanner;
    public String titulo;
    public String descricao;

    private ArrayList listaDeTarefas;

    public GerenciadorDeTarefas() {
        this.scanner = new Scanner(System.in);
        this.titulo = titulo;
        this.descricao = descricao;
        this.listaDeTarefas = listaDeTarefas;
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
        System.out.println("Tarefa adiconada com sucesso" );
        scanner.close();
        System.out.println("Descreva sua tarefa: ");
        setDescricao(scanner.nextLine());
        System.out.println("Descrição adiconada com sucesso" );
        Tarefa NovaTarefa = new Tarefa(1,"estudar java","ESTUDAR QUE NEM LOUCO");
        listaDeTarefas.add(NovaTarefa);
        System.out.println("Descrição adiconada com sucesso" );
    }
}

package controlers;

public class Tarefa{
    private int id;
    private String titulo;
    private String descricao;
    private SituacaoEnnum concluida;

    public Tarefa() {
    }

    public Tarefa(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = SituacaoEnnum.NAO_CONCLUIDO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public SituacaoEnnum getConcluida() {
        return concluida;
    }

    public void setConcluida(SituacaoEnnum concluida) {
        this.concluida = concluida;
    }
}

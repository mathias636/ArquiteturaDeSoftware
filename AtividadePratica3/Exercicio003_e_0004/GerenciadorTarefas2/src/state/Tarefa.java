package state;

/*
 *  Professor Gerson Risso
 */
public class Tarefa {
  private String nome;
  private String descricao;
  private Estado estado = EstadoTarefa.PENDENTE;
  private static Tarefa tarefa;

    public Tarefa() {
    }

    private Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public static Tarefa getInstanciaTarefa(String nome, String descricao) {
      if(tarefa == null){
        tarefa = new Tarefa(nome, descricao);
      }
      return tarefa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void requisitarAtrasada(){
      estado.atrasada();
    }
    
    public void requisitarConcluida(){
      estado.concluida();
    }
    
    public void requisitarPendente(){
      estado.pendente();
    }   
}

package state;

public enum EstadoTarefa {
  PENDENTE {
    @Override
    public void atrasada(Tarefa tarefa) {
      tarefa.setEstado(Atrasada);
    }

    @Override
    public void concluida(Tarefa tarefa) {
      tarefa.setEstado(Concluida);
    }
  },
  ATRASADA {
    @Override
    public void atrasada(Tarefa tarefa) {
      // Não faz nada, pois já está atrasada
    }

    @Override
    public void concluida(Tarefa tarefa) {
      tarefa.setEstado(Concluida);
    }
  },
  CONCLUIDA {
    @Override
    public void atrasada(Tarefa tarefa) {
      // Não faz nada, pois já está concluída
    }

    @Override
    public void concluida(Tarefa tarefa) {
      // Não faz nada, pois já está concluída
    }
  };


  public static Estado getEstado(String estado) {
    if (estado.equals("PENDENTE"))
      return PENDENTE;
    if (estado.equals("ATRASADA"))
      return ATRASADA;
    if (estado.equals("CONCLUIDA"))
      return CONCLUIDA;
    return null;
  }
}

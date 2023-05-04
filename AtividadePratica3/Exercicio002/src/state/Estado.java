package state;

public interface EstadoTarefa {
    void pagamentoEmPreparacao();
    void pedidoEmPreparacao();
    void cancelarPedido();
    void pedidoEnviado();

}

package state;

public class CancelarPedido implements EstadoTarefa {

    private Compra compra;

    //construtor
    public CancelarPedido(Compra compra) {
        this.compra = compra;
    }

    //demais métodos
    @Override
    public void pagamentoEmPreparacao() {
        compra.setEstado(new PagamentoConfrimado(compra));
    }

    @Override
    public void pedidoEmPreparacao() {
        compra.setEstado(new PedidoEmPreparacao(compra));
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Pedido Cancelado");
    }

    @Override
    public void pedidoEnviado() {
        compra.setEstado(new PedidoEnviado(compra));
    }
    
    @Override
    public String toString() {
        return "CancelarPedido{compra=" + compra + "}";
    }
}

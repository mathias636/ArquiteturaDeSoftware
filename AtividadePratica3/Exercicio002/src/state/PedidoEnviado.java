package state;

public class PedidoEnviado implements EstadoTarefa {

    private Compra  compra;

    //construtor
    public PedidoEnviado(Compra compra){
        this.compra = compra;
    }


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
        compra.setEstado(new Cancelado(compra));
    }

    @Override
    public void pedidoEnviado() {
        System.out.println("Pedido já foi enviado");
    
    }

    //toString
    @Override
    public String toString() {
        return "PedidoEnviado{" + '}';
    }
    
}

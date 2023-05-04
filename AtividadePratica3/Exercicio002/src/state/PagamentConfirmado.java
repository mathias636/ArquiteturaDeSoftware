package state;

public class PagamentoConfrimado implements EstadoTarefa {

    private Compra compra;

    public PagamentoConfrimado(Compra p_compra){
        this.compra = p_compra;
    }

    @Override
    public void pagamentoEmPreparacao() {
        System.out.println("Pagamento já confirmado");
    }

    @Override
    public void pedidoEmPreparacao() {
        compra.setEstado(new PedidoEmPreparacao(compra));    
    }

    @Override
    public void cancelarPedido() {
        compra.setEstado(new CancelarPedido(compra));
    }

    @Override
    public void pedidoEnviado() {
        compra.setEstado(new PedidoEnviado(compra));
    }
    
    @Override
    public String toString(){
        return "PagamentoConfirmado{"+"compra="+compra+"}";
    }
}

package state;

public class PedidoEmPreparacao implements EstadoTarefa {

    //variável compra
    private Compra compra;
    
    //construtor
    public PedidoEmPreparacao(Compra compra_p) {
        this.compra = compra_p;
    }

    //impelmented methods
    @Override
    public void pagamentoEmPreparacao() {
        System.out.println("O pagamento já foi confirmado");
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
        return "PedidoEmPreparacao{"+"compra ="+compra+"}";
    }
    
}

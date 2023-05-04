package state;

public class Compra implements EstadoTarefa {
    private EstadoTarefa estado = new PedidoEmPreparacao(this);

    public Compra(){}

    //get e set
    public EstadoTarefa getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarefa estado) {
        this.estado = estado;
    }

    //demais métodos
    public void requisitar_CancelarPedido(){
        estado.cancelarPedido();
    }

    public void requisitar_PagamentoEmPreparacao(){
        estado.pagamentoEmPreparacao();
    }

    public void requisitar_PedidoEmPreparacao(){
        estado.pedidoEmPreparacao();
    }

    public void requisitar_PedidoEnviado(){
        estado.pedidoEnviado();
    }


}

package ex004.composite;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String cliente;
    private int numeroPedido;

    private List<Component> lista = new ArrayList<>();
    private double totalCompra;

    public Pedido(String cliente, int numeroPedido, List<Component> lista){
        this.cliente = cliente;
        this.numeroPedido = numeroPedido;
        this.lista = lista;
    }

    public void adicionarProduto(Component component){
        lista.add(component);
    }

    public void removerProduto(Component component){
        lista.remove(component);
    }

    public double getTotalCompra(){
        totalCompra = 0;
        for (Component component : lista) {
            totalCompra += component.getPreco();
        }
        return totalCompra;
    }

    /*
    *  getters and setters
    */
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Component> getLista() {
        return lista;
    }

    public void setLista(List<Component> lista) {
        this.lista = lista;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    //termine a função abaixo
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número do Pedido: ").append(numeroPedido).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Produtos: \n");
        for (Component component : lista) {
            sb.append("- ").append(component).append(": R$ ").append(component.getPreco()).append("\n");
        }
        sb.append("Total da compra: R$ ").append(getTotalCompra());
        return sb.toString();
    }
}

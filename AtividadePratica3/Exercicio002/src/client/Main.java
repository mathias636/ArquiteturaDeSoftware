package client;

import state.Compra;

public class Main {
    public static void main(String[] args) throws Exception {
        Compra compra = new Compra();
        compra.requisitar_PagamentoEmPreparacao();
        System.out.println(compra.getEstado());
    }
}

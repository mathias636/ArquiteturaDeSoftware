package facade;

import composite.*;

public class CestaFacade {

    private Composite cesta;

    public CestaFacade(String nome) {
        cesta = new Composite(nome);
    }

    public void adicionarProduto(double preco, String nome) {
        Component produto = new Leaf(preco, nome);
        cesta.adicionar(produto);
    }

    public String getTotal() {
        return String.valueOf(cesta.getPreco());
    }

    @Override
    public String toString() {
        return cesta.toString();
    }
}

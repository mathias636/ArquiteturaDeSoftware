package ex004.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Compostie implements Component {
    private List<Component> produtos = new ArrayList<>();

    public void adicionarProduto(Component produto){
        produtos.add(produto);
    }

    public void removerProduto(Component produto){
        produtos.remove(produto);
    }

    public double getPreco(){
        double precoTotal = 0;
        for(Component component : produtos){
            precoTotal += component.getPreco();
        }
        return precoTotal;
    }

    // public List<Component> getProdutos(){
    //     return produtos;
    // }


}

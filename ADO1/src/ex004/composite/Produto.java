package ex004.composite;

public class Produto extends Compostie{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return nome + " - R$" + preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    

}

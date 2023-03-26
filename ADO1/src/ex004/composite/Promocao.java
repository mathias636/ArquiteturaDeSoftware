package ex004.composite;

public class Promocao extends Produto {
    private double desconto;

    public Promocao(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;

    }

    @Override
    public double getPreco() {
        return super.getPreco() * (1- desconto);
    }

    @Override
    public String toString(){
        return super.toString() + " (desconto de " + (int)(desconto * 100) + "%)";
    }
    
}

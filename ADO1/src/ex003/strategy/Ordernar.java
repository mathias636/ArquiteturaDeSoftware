package ex003.strategy;

public class Ordernar {
    private Strategy strategy;

    public Ordernar(Strategy strategy){
        this.strategy = strategy;
    }


    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void ordenar(int[] v){
        strategy.ordenar(v);
    }
}

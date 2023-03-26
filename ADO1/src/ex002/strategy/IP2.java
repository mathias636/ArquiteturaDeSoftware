package strategy;

public class IP2 implements Strategy {

    @Override
    public double calcular(double orcamento) {
        return orcamento * 0.15;
    }
    
}

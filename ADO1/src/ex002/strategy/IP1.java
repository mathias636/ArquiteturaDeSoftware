package strategy;

public class IP1 implements Imposto {

    @Override
    public double calcular(double orcamento) {
        return orcamento * 0.1;
    }
    
}

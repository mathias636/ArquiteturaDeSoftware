package strategy;

public class IP3 implements Strategy {

    @Override
    public double calcular(double orcamento) {
        return orcamento * 0.25;
    }

}

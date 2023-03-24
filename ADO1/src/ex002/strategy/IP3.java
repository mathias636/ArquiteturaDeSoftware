package strategy;

public class IP3 implements Imposto {

    @Override
    public double calcular(double orcamento) {
        return orcamento * 0.25;
    }

}

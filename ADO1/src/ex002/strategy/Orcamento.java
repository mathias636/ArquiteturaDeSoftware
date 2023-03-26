package strategy;

import java.util.List;

public class Orcamento {

    private final List<Double> valores;
    private final Strategy imposto;

    public Orcamento(List<Double> valores, Strategy imposto) {
        this.valores = valores;
        this.imposto = imposto;
    }
    
    public double getTotal(){
        double total = 0;

        for(double valor : valores){
            total += valor;
        }
        return total + imposto.calcular(total);
    }
    
}

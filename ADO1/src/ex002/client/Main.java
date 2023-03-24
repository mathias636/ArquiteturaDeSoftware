package client;

import java.util.Arrays;
import java.util.List;

import strategy.*;

public class Main {

    public static void main(String[] args) {
        List<Double> valores = Arrays.asList(100.0, 200.0, 300.0);
        

        Orcamento orcamento1 = new Orcamento(valores, new IP1());
        double total1 = orcamento1.getTotal();
        System.out.println("Valor total com imposto IP1: " + total1);

        Orcamento orcamento2 = new Orcamento(valores, new IP2());
        double total2 = orcamento2.getTotal();
        System.out.println("Valor total com imposto IP2: " + total2);

        Orcamento orcamento3 = new Orcamento(valores, new IP3());
        double total3 = orcamento3.getTotal();
        System.out.println("Valor total com imposto IP3: " + total3);
    }
}

package ex004.client;

import java.util.ArrayList;
import java.util.List;

import ex004.composite.Component;
import ex004.composite.Pedido;
import ex004.composite.Produto;
import ex004.composite.Promocao;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Celular", 1500.0);
        Produto p2 = new Produto("Notebook", 3500.0);
        Produto p3 = new Produto("Smartwatch", 800.0);
        
        Promocao p4 = new Promocao("Camisa Polo", 100.0, 0.1);
        Promocao p5 = new Promocao("Calça Jeans", 150.0, 0.15);
        
        List<Component> carrinho1 = new ArrayList<>();
        List<Component> carrinho2 = new ArrayList<>();
        
        carrinho1.add(p1);
        carrinho1.add(p3);
        carrinho1.add(p4);
        
        carrinho2.add(p2);
        carrinho2.add(p3);
        carrinho2.add(p5);
        
        Pedido pedido1 = new Pedido("João", 1, carrinho1);
        Pedido pedido2 = new Pedido("Maria", 2, carrinho2);
        
        System.out.println("Detalhes do pedido 1:");
        System.out.println(pedido1.toString());
        System.out.println("----------------------------");
        System.out.println("Detalhes do pedido 2:");
        System.out.println(pedido2.toString());
    }
}


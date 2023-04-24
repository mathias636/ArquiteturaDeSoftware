package client;

import facade_singleton.*;
import projeto.*;

public class Main {
    public static void main(String[] args) {
        
        //cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");
        cliente1.setEndereco(new Endereco("Rua das Flores", 123));

        //produto
        Produto produto1 = new Produto("Produto1", "Categoria1", 19.99);
        Produto produto2 = new Produto("Produto2", "Categoria2", 29.99);

        //operacoes singleton
        Operacoes operacoes = Operacoes.getInstance();

        operacoes.atualizarEndereco(cliente1, "Rua dos Espinhos", 321);
        
        operacoes.adicionarProduto(cliente1, produto1);
        operacoes.adicionarProduto(cliente1, produto2);

        operacoes.removerProduto(cliente1, produto2);

        //imprimir
        System.out.println("\n"+cliente1.toString());
    }    
}

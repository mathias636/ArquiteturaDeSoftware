package facade_singleton;

import java.util.ArrayList;

import projeto.*;

public class Operacoes {

    private static Operacoes instancia;

    private ArrayList<Produto> carrinho;

    // Construtor privado para evitar instanciação direta
    private Operacoes() {
        carrinho = new ArrayList<>();
    }

    public static Operacoes getInstance() {
        if (instancia == null) {
            instancia = new Operacoes();
        }
        return instancia;
    }

    public void atualizarEndereco(Cliente cliente, String rua, int numero) {
        Endereco endereco = cliente.getEndereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
    }

    public void adicionarProduto(Cliente cliente, Produto produto) {
        carrinho.add(produto);
        cliente.setProdutos(carrinho);
    }

    public void removerProduto(Cliente cliente, Produto produto) {
        carrinho.remove(produto);
        cliente.setProdutos(carrinho);
    }

}

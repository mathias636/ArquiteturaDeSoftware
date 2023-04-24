package projeto;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private Endereco endereco;
    private  ArrayList<Produto> produtos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    //método toString
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ",\n endereco=" + endereco + ",\n produtos=" + produtos + '}';
    }   
}

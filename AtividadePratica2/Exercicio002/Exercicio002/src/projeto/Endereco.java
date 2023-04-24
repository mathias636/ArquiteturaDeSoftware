package projeto;

public class Endereco {
    
    private String rua;
    private int numero;

    //construtor
    
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {}

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //método toString()
    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + '}';
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author elton.fribeiro
 */
public class Personagem {
  private String nome;
  private String descricao;
  private Estado estado = new Esperando(this);

    public Personagem(String nome) {
        this.nome = nome;
    }
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void requisitarAbaixando(){
      estado.abaixando();
    }
    
    public void requisitarCorrendo(){
      estado.correndo();
    }
    
    public void requistarEsperando(){
      estado.esperando();
    }
    
    public void requistarPulando(){
      estado.pulando();
    }
  
  
    
}

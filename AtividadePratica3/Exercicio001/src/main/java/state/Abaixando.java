/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author elton.fribeiro
 */
public class Abaixando implements Estado {
    
    private String nome="Abaixando";
    private Personagem personagem;

    public Abaixando(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public void abaixando() {
        System.out.println("Já está abaixando");
    }

    @Override
    public void correndo() {
        personagem.setEstado(new Correndo(personagem));
    }

    @Override
    public void esperando() {
        personagem.setEstado(new Esperando(personagem));
    }

    @Override
    public void pulando() {
        personagem.setEstado(new Pulando(personagem));
    }

    @Override
    public String toString() {
        return "Abaixando{ personagem=" + personagem + '}';
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author elton.fribeiro
 */
public class Esperando implements Estado {
    
    private String nome="Esperando";
    private Personagem personagem;

    public Esperando(Personagem personagem) {
        this.personagem = personagem;
    }
    
    @Override
    public void abaixando() {
        personagem.setEstado(new Abaixando(personagem));
    }

    @Override
    public void correndo() {
        personagem.setEstado(new Correndo(personagem));
    }

    @Override
    public void esperando() {
        System.out.println("Já está correndo");
    }

    @Override
    public void pulando() {
        personagem.setEstado(new Pulando(personagem));
    }

    @Override
    public String toString() {
        return "Esperando{" + "personagem=" + personagem + '}';
    }
    
    
    
}

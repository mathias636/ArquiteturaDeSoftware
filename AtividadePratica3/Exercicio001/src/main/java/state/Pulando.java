/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author elton.fribeiro
 */
public class Pulando implements Estado{
    
    private String nome="Pulando";
    private Personagem personagem;

    public Pulando(Personagem personagem) {
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
        personagem.setEstado(new Esperando(personagem));
    }

    @Override
    public void pulando() {
        System.out.println("Já está pulando");
    }

    @Override
    public String toString() {
        return "Pulando{" + "personagem=" + personagem + '}';
    }
    
    
    
}

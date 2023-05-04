/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author elton.fribeiro
 */
public class Correndo implements Estado{
    
    private String nome="Correndo";
    private Personagem personagem;

    public Correndo(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public void abaixando() {
        personagem.setEstado(new Abaixando(personagem));
    }

    @Override
    public void correndo() {
        System.out.println("Já está correndo");
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
        return "Correndo{" + "personagem=" + personagem + '}';
    }
    
    
}

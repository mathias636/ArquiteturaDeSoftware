/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cliente;

import state.Personagem;

/**
 *
 * @author elton.fribeiro
 */
public class ProjetoJogo {

    public static void main(String[] args) {
      Personagem personagem = new Personagem("Elton");
      personagem.requisitarAbaixando();
      System.out.println(personagem.getEstado());
    }
}

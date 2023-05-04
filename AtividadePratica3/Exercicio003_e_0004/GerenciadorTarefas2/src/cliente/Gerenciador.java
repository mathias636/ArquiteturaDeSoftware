

package cliente;

import state.*;
/*
*  Professor Gerson Risso
*/
public class Gerenciador {
 
    public static void main(String[] args) {

      Tarefa tarefa = Tarefa.getInstanciaTarefa("Gerson","Implentar o pattern state");
      
      tarefa.requisitarConcluida();
      System.out.println(tarefa.getEstado());
    }

}

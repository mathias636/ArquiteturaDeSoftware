package cliente;

import composite.*;
import facade.CestaFacade;


/*
*  Professor Gerson Risso
*/
public class UsaCesta {
 
    public static void main(String[] args) {

      CestaFacade cesta = new CestaFacade("Cesta de café");
      CestaFacade caixa_de_bombom = new CestaFacade("Caixa de bombom");

      cesta.adicionarProduto(12.56, "café");
      cesta.adicionarProduto(10.26, "leite");
      cesta.adicionarProduto(6.12, "pao de queijo");

      caixa_de_bombom.adicionarProduto(8.23, "bombom cereja");
      caixa_de_bombom.adicionarProduto(9.78, "bombom licor");

      System.out.println(cesta);
      System.out.println(caixa_de_bombom);
      System.out.println("Total: " + cesta.getTotal());
    }

}

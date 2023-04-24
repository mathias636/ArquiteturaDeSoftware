package cliente;

import java.util.Scanner;
import lista.*;
import lista_facade.*;

public class UsaLista {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ListaFacade listaFacade = new ListaFacade();
        int opc;

        while (true) {
            System.out.println("[1] - Inserir um novo elemento\n"
                    + "[2] - Inserir em uma posição da lista\n"
                    + "[3] - Exibir a lista\n"
                    + "[4] - Pesquisar por id\n"
                    + "[5] - Remover um elemento\n"
                    + "[6] - Sair");
            System.out.println("Escolha uma operação: ");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    listaFacade.inserir();
                    break;
                
                case 2: 
                    listaFacade.inserir_em_uma_posicao();
                    break;
                
                case 3:
                    listaFacade.exibir();
                    break;
                
                case 4:
                    listaFacade.pesquisar();
                    break;
                
                case 5:
                    listaFacade.remover();
                    break;
                case 6:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Operação inválida!");
            }
            
        }
        
    }
    
}

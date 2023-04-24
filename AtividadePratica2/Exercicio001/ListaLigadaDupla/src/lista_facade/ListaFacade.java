package lista_facade;

import java.util.Scanner;

import lista.*;

public class ListaFacade {

    Lista lista = new Lista();
    Contato contato;
    Scanner teclado = new Scanner(System.in);

    public ListaFacade(){}

    public void inserir() {
        System.out.println("Informe o nome e o telefone");
        contato = new Contato(teclado.next(), teclado.next());
        lista.inserir(contato);
    }

    public void inserir_em_uma_posicao() {
        try {

            System.out.println("Informe o nome e o telefone");
            contato = new Contato(teclado.next(), teclado.next());
            System.out.println("Informe a posição na lista");
            lista.inserir(contato, teclado.nextInt());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }

    public void exibir() {
        lista.exibir(Modo.DIREITA);
    }

    public void pesquisar() {
        System.out.println("Digite o ID do contato");
        int id = teclado.nextInt();
        Elemento e = lista.pesquisar(id);
        if (e != null) {
            System.out.println(e.getObjeto());
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public void remover() {
        try {
            System.out.println("Digite o ID do contato");
            int id = teclado.nextInt();
            if (lista.remover(id)) {
                System.out.println("Removido!");
            } else {
                System.out.println("Não foi possível remover!");
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}

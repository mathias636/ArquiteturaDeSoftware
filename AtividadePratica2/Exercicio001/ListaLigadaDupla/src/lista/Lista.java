package lista;

/*
 *  Professor Gerson Risso
 */
public class Lista {

    Elemento inicio, atual, aux;

    public boolean verificar() {
        return inicio == null;
    }

    /**
     * Insere, em uma posição passada por parâmetro, um elemento 
     * na lista duplamente ligada.
     * @param objeto Object
     * @param posicao int
     */
    public void inserir(Object objeto, int posicao) {
      if(posicao>0 && posicao<tamanho()){
         Elemento e=inicio, novo;
         for(int i=1;i<posicao;i++){
           e=e.getProx();
         }
         novo=new Elemento(e.getProx(),e,objeto);
         e.getProx().setAnt(novo);
         e.setProx(novo);
      }else{
          throw new IllegalArgumentException("Valor inválido!");
      }
    }
    
    public void inserir(Object objeto) {
        if (verificar()) {//lista vazia
            inicio = new Elemento(null, null, objeto);
            aux = inicio;
        } else {
            atual = new Elemento(null, aux, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir(Modo modo) {
        Elemento e;
        if (modo.equals(Modo.DIREITA)) {
            e = inicio;
            while (e != null) {
                System.out.println(e.getObjeto());
                e = e.getProx();
            }
        } else {
            e = atual;
            while (e != null) {
                System.out.println(e.getObjeto());
                e = e.getAnt();
            }
        }
    }

    public Elemento pesquisar(int id) {
        Elemento e = inicio;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto();//Cast
            if (id == c.getId()) {
                return e;
            }
            e = e.getProx();
        }
        return null;
    }

    public boolean remover(int id) {
        Elemento e = pesquisar(id);
        if (e != null) {
            if (e == inicio) {
                inicio = inicio.getProx();
                inicio.setAnt(null);
                e.setProx(null);
            } else if (e == atual) {
                atual = e.getAnt();
                aux = atual;
                aux.setProx(null);
                e.setAnt(null);
            } else {
                e.getAnt().setProx(e.getProx());
                e.getProx().setAnt(e.getAnt());
                e.setProx(null);
                e.setAnt(null);
            }
            return true;
        }
        return false;
    }

   
    /**
     * Realiza a contagem de elementos na lista
     * duplamente ligada.
     * @return int 
     */ 
    public int tamanho() {
        Elemento e = inicio;
        int cont=0;
        while (e != null) {
            cont++;
            e = e.getProx();
        }
        return cont;
    }
}

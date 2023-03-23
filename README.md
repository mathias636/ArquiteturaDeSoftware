## Arquitetura de Software TADS 4º Semestre

### ADO1
1) Escreva uma classe implementando o padrão singleton. Foi
apresentado, nas aulas, duas versões de classes com este
padrão. Utilize uma versão que a instancie somente ao invocar o
método de acesso global. Porém, essa mesma versão não poderá
ser “quebrada” em ambientes multi-threads.
---
2) Considerando que existem vários impostos (ip1,ip2, ip3) sobre
produtos ou serviços. E que a taxas são:
● ip1 - 10%
● ip2 - 15%
● ip3 - 25%
Escreva um projeto Java, tendo como base o padrão de projeto
strategy, que determine o cálculo de orçamento envolvendo
serviços e/ou produtos. Considere as incidências dos impostos
listados acima. O seu projeto deve eliminar as cadeias de if/else
ou switch/case e também manter em classes específicas, os
algoritmos de cálculos de impostos. Escreva uma classe de
contexto que teste todos os impostos listados anteriormente.
Cálculo: valor orçamento*imposto
O Orcamento é uma classe que contém uma lista de valores dos
serviços/produtos.
---
3) Dados os métodos de ordenação a seguir, escreva um projeto java
que implemente o padrão Strategy. O seu projeto deve eliminar as
cadeias de if/else ou switch/case e também manter em classes
separadas, os algoritmos de ordenação. Escreva uma classe de
contexto que teste todos os métodos utilizados.

```
public void insertion(int[] v) {
        int i, j;
        int temp;
        for (i = 1; i < v.length; i++) {
            temp = v[i];
            j = i;
            while (j > 0 && v[j - 1] >= temp) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = temp;
        }
    }

    public void selection(int[] v) {
        int i, j, min, aux;
        for (i = 0; i < v.length - 1; i++) {
            min = i;
            for (j = i + 1; j < v.length; j++)
                if (v[j] < v[min])
                    min = j;
            aux = v[i];
            v[i] = v[min];
            v[min] = aux;
        }
    }

    public void bubble(int[] v){
    int i,j;
    int temp;
    for(j=0;j<v.length-1;j++)
    for(i=0;i<v.length-1-j;i++)
    if(v[i]>v[i+1]){
    temp=v[i];
    v[i]=v[i+1];
    v[i+1]=temp;
    }
    }
public void insertion(int[] v) {
        int i, j;
        int temp;
        for (i = 1; i < v.length; i++) {
            temp = v[i];
            j = i;
            while (j > 0 && v[j - 1] >= temp) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = temp;
        }
    }

    public void selection(int[] v) {
        int i, j, min, aux;
        for (i = 0; i < v.length - 1; i++) {
            min = i;
            for (j = i + 1; j < v.length; j++)
                if (v[j] < v[min])
                    min = j;
            aux = v[i];
            v[i] = v[min];
            v[min] = aux;
        }
    }

    public void bubble(int[] v){
    int i,j;
    int temp;
    for(j=0;j<v.length-1;j++)
    for(i=0;i<v.length-1-j;i++)
    if(v[i]>v[i+1]){
    temp=v[i];
    v[i]=v[i+1];
    v[i+1]=temp;
    }
    }
---
4) Utilize o pattern composite para simular um carrinho de compras
de uma loja virtual. Deve-se obter o preço total da compra, sendo
esta operação, a única a ser declarada na interface.
Você deve seguir o diagrama apresentado em aula para escrever
as suas classes. Em tempo, escreva uma classe Pedido com os
atributos: nomeCliente (String), lista (Produto), numeroPedido (int),
totalCompra (double). Utilize essa classe como classe de contexto
do pattern. além da classe principal para instanciar produtos,
pedidos e carrinhos de compras. Escreva também, uma classe do
tipo Leaf denominada Promocao, para definir produtos com
descontos. Esta classe deve ter os atributos: nome (String), preco
e desconto com número decimal real de dupla precisão. O
construtor da classe deve receber os parâmetros: nome, preco,
desconto e calcular o desconto devido do produto. A saída deve
ter todas as informações do pedido

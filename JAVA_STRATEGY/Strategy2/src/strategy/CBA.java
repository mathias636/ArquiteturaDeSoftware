package strategy;

/*
 *  Professor Gerson Risso
 */
public class CBA implements Frete{

    @Override
    public double calcFrete(Distancia distancia) {
         return distancia.getValor()*0.2;
    }

}

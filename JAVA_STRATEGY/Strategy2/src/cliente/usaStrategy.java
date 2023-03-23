package cliente;


/*
*  Professor Gerson Risso
 */
import strategy.*;
public class usaStrategy {

    public static void main(String[] args) {
       
         
    }

    public static double calcularFrete(Distancia distancia, Empresas empresa) {
        double frete = -1;
        Frete contratada=null;
        if (empresa.equals(Empresas.ABC)) {
            contratada=new ABC();
            frete = contratada.calcFrete(distancia);
        } else if (empresa.equals(Empresas.CBA)) {
            contratada=new CBA();
            frete = contratada.calcFrete(distancia);
        } else if (empresa.equals(Empresas.XPTO)) {
            contratada=new XPTO();
            frete = contratada.calcFrete(distancia);
        }
        return frete;
    }
}

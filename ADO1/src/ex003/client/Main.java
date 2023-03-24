package ex003.client;

import java.util.Arrays;

import ex003.strategy.Bubble;
import ex003.strategy.Insertion;
import ex003.strategy.Ordernar;
import ex003.strategy.Selection;

public class Main {
    public static void main(String[] args) {
        int[] v = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        Ordernar inserstion = new Ordernar(new Insertion());
        Ordernar selection = new Ordernar(new Selection());
        Ordernar bubble = new Ordernar(new Bubble());
        
        inserstion.ordenar(v);
        System.out.println(Arrays.toString(v));

        selection.ordenar(v);
        System.out.println(Arrays.toString(v));

        bubble.ordenar(v);
        System.out.println(Arrays.toString(v));

    }
}

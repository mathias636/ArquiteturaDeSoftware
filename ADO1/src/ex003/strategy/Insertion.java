package ex003.strategy;

public class Insertion implements Strategy {

    @Override
    public void ordenar(int[] v) {
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
}

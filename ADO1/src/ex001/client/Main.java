package ex001.client;
import ex001.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // Deve imprimir true
        System.out.println(s1+"\t"+s2); // Deve imprimir true
    }
}

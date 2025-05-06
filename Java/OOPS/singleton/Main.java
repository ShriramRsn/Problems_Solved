package OOPS.singleton;
import OOPS.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = new Singleton.getInstance();
        Singleton obj2 = new Singleton.getInstance();
        System.out.println(obj);
        System.out.println(obj2);
    }
}

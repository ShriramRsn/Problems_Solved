package OOPS.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj3 = obj;
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj == obj2);
        System.out.println(obj == obj3);
    }
}

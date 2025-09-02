package OOPS.Generics;

public class GenericsExample {
    public static void main(String[] args) {
        genereic example = new genereic();
        System.out.println(example.toDisplay("hello"));
        System.out.println(example.toDisplay(123));
        System.out.println(example.toDisplay(4.5));
        System.out.println(example.a);
    }
}

class genereic{
    static int a = 23;
    public static <T> T toDisplay(T display){
        return display;
    }
}

/*  Generics:
 *      They allow us to write code that works with different data types
 *      using a single class, interface or method.
 */
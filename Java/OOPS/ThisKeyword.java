package OOPS;

public class ThisKeyword {
    public static void main(String[] args) {
        Info Shriram = new Info();
        Shriram.name = "Shriram";
        Shriram.mark = 67;
        Shriram.year = 2004;
        System.out.println(Shriram.year);
    }
}

class Info{
    String name;
    int mark; 
    int year;
    Info() {
        this.name = name;
        this.mark = mark;
        this.year = year;
    } 
}

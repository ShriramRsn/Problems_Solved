package OOPS;

public class ThisKeyword {
    public static void main(String[] args) {
        Info Shriram = new Info("Shriram",81,2004);
        Info Kunal;
        Kunal = new Info("Kunal", 98, 1998);
        System.out.println(Shriram.year);
        System.out.println(Kunal.year);
    }
}

class Info{
    String name;
    int mark; 
    int year;
    public Info(String name,int mark,int year) {
        this.name = name;
        this.mark = mark;
        this.year = year;
    } 
}

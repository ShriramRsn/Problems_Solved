package OOPS;

public class staticKeyword {
    public static void main(String[] args) {
        /*  To Access a non static method, Have to create an object
        greeting();
        */
        /*A static method can be called without creating an object ref*/
        hello();
        //Static Variable
        /* A static method can access only static data. It cannot access non-static data (instance variables) */
        myThoughtsOnDays godDay = new myThoughtsOnDays(8, "Sunday");
        myThoughtsOnDays devilDay = new myThoughtsOnDays(8, "Monday");
        myThoughtsOnDays satanDay = new myThoughtsOnDays(8, "Tuesday");
        System.out.println(myThoughtsOnDays.count);
        System.out.println();

        staticKeyword greet = new staticKeyword();
        greet.fun();

    } 

    static void hello(){
        System.out.println("HelloWorld!");
    }

    void fun(){
        System.out.println("This is Function() Statement");
        greeting();
    }
    
    void greeting(){
        System.out.println("This is Greeting() Statement");
    }
}

class myThoughtsOnDays{
    int number;
    String day;
    static int count;

    public myThoughtsOnDays(int number, String day) {
        this.number = number;
        this.day = day;
        myThoughtsOnDays.count += 1;
    }



}
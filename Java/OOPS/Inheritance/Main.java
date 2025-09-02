package OOPS.Inheritance;

public class Main {
  public static void main(String[] args) {
    Dog Husky = new Dog(23,"Furry","howls");
    GermanShepherd Spark = new GermanShepherd();
    Dog doggy = new Dog();
    Dog Malinois = new GermanShepherd(50, "High", "Growl");
    System.out.println("The Malinois says: " + Malinois.getBark());
    Spark.speak();
    doggy.speak();
    
  }
}

/*  Inheritance:
 *      It allows one class to inherit properties and methods from another class.
*/
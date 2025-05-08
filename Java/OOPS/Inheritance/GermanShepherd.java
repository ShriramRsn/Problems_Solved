package OOPS.Inheritance;

public class GermanShepherd extends Dog {
    int age;
    public GermanShepherd() {
        super(12, "Less", "Woff");
        
    }

    public GermanShepherd(int age,String fur,String bark){
        super(age,fur,bark);
    }

    @Override
    public void speak() {
        System.out.println("The German Shepherd says: " + getBark()+ " " + this.age + "age init from GermanShepherd");
        System.out.println("The German Shepherd says: " + getBark()+ " " + super.age + "age init from Dog");
    }
}

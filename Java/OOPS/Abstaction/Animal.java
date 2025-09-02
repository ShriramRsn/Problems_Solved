package OOPS.Abstaction;

public class Animal extends main{

    @Override
    public void animal() {
        System.out.println("Animal Function is called for Class animal");
    }

    @Override
    public String animalSound() {
        String sound = "Bark";
        return sound;
    }
    
    public static void main(String[] args) {
        main obj = new Animal();
        obj.animal();
        System.out.println(obj.animalSound());

    }
}

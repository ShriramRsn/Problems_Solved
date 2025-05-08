package OOPS.Inheritance;

public class Dog {
    public int age;
    private String fur;
    private String bark;

    public Dog(int age, String fur, String bark) {
        // super(); Object class
        this.age = age;
        this.fur = fur;
        this.bark = bark;
    }

    public Dog() {
        this(1, "None", "Ruff");
    }

    public Dog(Dog other) {
        this.age = other.age;
        this.fur = other.fur;
        this.bark = other.bark;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getFur() {
        return fur;
    }

    public String getBark() {
        return bark;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    public void speak() {
        System.out.println("The dog says: " + bark);
    }
}

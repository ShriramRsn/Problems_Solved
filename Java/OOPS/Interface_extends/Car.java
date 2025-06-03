package OOPS.Interface_extends;

public class Car implements Engine {

    @Override
    public void pEngine() {
        System.out.println("Power Engine");
    }

    @Override
    public void eEngine() {
        System.out.println("Electric Engine");
    }
    
    public static void main(String[] args) {
        Car car = new Car();
        car.eEngine();
    }
}

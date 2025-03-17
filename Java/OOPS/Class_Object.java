package OOPS;

public class Class_Object {
    public static void main(String[] args){
        Car model_S_Plaid = new Car("Model S Plaid",348,200,1020,"Silver");
        Car model_S = new Car("Model S",410,130,670,"Red");
        System.out.println("CAR: ");
        System.out.println(model_S_Plaid.model + ", " + model_S_Plaid.range + " ml");
        System.out.println(model_S.model + ", " + model_S.range + " ml \n");

        Truck cyberTruck =  new Truck("CyberTruck", 440, 130, 11000);
        System.out.println("Truck: ");
        System.out.println(cyberTruck.model + ", " + cyberTruck.range + " ml" + ", " + cyberTruck.towing + " lb \n");
        
    }
}

class Car{
    String model;
    int range;
    int topSpeed;
    int peakPower;
    String color;

    Car(String model, int range, int topSpeed, int peakPower, String color){
        this.model = model;
        this.range = range;
        this.topSpeed = topSpeed;
        this.peakPower = peakPower;
        this.color = color;
    }
}

class Truck{
    String model;
    int range;
    int topSpeed;
    int towing;

    Truck(String model, int range, int topSpeed, int towing){
        this.model = model;
        this.range = range;
        this.topSpeed = topSpeed;
        this.towing = towing;
    }
}

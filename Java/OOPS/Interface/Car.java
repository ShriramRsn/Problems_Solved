package OOPS.Interface;

public class Car implements Drive, Media {

    @Override
    public void start() {
        System.out.println("Car engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine is stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating the car");
    }

    @Override
    public void brake() {
        System.out.println("Applying brake in car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning the car in left direction");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning the car in right direction");
    }

    @Override
    public void play() {
        System.out.println("Playing songs in the car");
    }

    @Override
    public void pause() {
        System.out.println("Song has been paused in the car");
    }
    
}

package interfaces;

public class Car implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("My brake Like a normal car..");
    }

    @Override
    public void start() {
        System.out.println("I can start engine like a normal car..");
    }

    @Override
    public void stop() {
        System.out.println("I can stop engine like a normal car//");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a  normal car..");
    }
}

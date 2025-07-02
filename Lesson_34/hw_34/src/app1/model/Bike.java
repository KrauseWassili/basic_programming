package app1.model;

public class Bike implements Vehicle {
    private final static String type="Bike";

    @Override
    public void drive() {
        System.out.println("I'm a " + Vehicle.species + " type " + type + ". I'm driving!");
    }

    @Override
    public void stop() {
        System.out.println("I'm a " + Vehicle.species + " type " + type + ". I'm stopping!");
    }
}

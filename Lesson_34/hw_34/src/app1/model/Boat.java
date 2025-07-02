package app1.model;

public class Boat implements Vehicle {
    private final static String type="Boat";

    @Override
    public void drive() {
        System.out.println("I'm a " + Vehicle.species + " type " + type + ". I'm driving!");
    }

    @Override
    public void stop() {
        System.out.println("I'm a " + Vehicle.species + " type " + type + ". I'm stopping!");
    }
}

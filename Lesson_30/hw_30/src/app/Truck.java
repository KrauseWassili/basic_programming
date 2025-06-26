package app;

public class Truck extends Vehicle{
double loadCapacity;

    public Truck(String number, String brand, int year, double loadCapacity) {
        super(number, brand, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void drive(){
        System.out.println(getNumber() + ": Поехали! Я перевожу " + loadCapacity + " тонн груза.");
    }
}

package app;

public class Bus extends Vehicle{
    int numberOfPassenger;

    public Bus(String number, String brand, int year, int numberOfPassenger) {
        super(number, brand, year);
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void drive(){
        System.out.println(getNumber() + ": Поехали! Я перевожу " + numberOfPassenger + " пассажиров.");
    }
}

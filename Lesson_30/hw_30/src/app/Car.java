package app;

public class Car extends Vehicle{

    public Car (String number, String brand, int year){
        super(number,brand,year);
    }

    public void drive(){
        System.out.println(getNumber() + ": Поехали!");
    }
}

/*
Задача 1.  Mail Delivery
Создайте интерфейс Vehicle с методами drive(), stop(). Реализуйте этот интерфейс в классах Car, Boat, Bike.

 */

package app1;

import app1.model.Bike;
import app1.model.Boat;
import app1.model.Car;
import app1.model.Vehicle;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Car());
        vehicleList.add(new Boat());
        vehicleList.add(new Bike());

        driveAll(vehicleList);
        stoppAll(vehicleList);
    }

    public static void driveAll(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList)
            vehicle.drive();
    }

    public static void stoppAll(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList)
            vehicle.stop();
    }
}



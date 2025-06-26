/*
Задача 1

Предположим, у вас есть программа для учета различных видов транспортных средств в автопарке.
У вас есть базовый класс Vehicle, который представляет общую информацию о транспортном средстве,
такую как номер (number), марка (brand)  и год выпуска (year).

Создайте подклассы для различных типов транспортных средств, таких как Car, Truck, Bus и т. д.
В каждом Truck, Bus добавьте дополнительные свойства, специфичные для данного типа транспортного средства.
Например, для Truck - грузоподъемность (loadCapacity),  для Bus - кол-во пассажиров (numberOfSeats or numberOfPassenger).
Создайте метод drive() который выводит на экран номер транспортного средства и слово 'поехали'.
Кроме этого, в случае Truck - метод должен выводить запись о том, что перевозим столько то тонн груза,
а в случае Bus - столько то пассажиров.
В main создайте список транспортных средств и каждое "отправьте в поездку" т.е. drive()
*/

package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Truck("HBCA423", "Scania", 2021, 25));
        vehicleList.add(new Car("HHTE834", "BMW", 2018));
        vehicleList.add(new Bus("OHZBB144", "Mercedes", 2025, 46));

        for (Vehicle vehicle : vehicleList) {
            vehicle.drive();
        }
    }
}
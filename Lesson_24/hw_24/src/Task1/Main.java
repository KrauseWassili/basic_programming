/*
Wassili Krause HW_23_1 cochort_68M

Задача 2
Создайте класс Auto (машина) Поля: брэнд, цвет, год выпуска, цена Создайте несколько объектов этого класса. 
Напишите метод, который выводит на экран данные машины.
*/

package Task1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Red", 2024, 20_543);
        Car car2 = new Car("Nissan", "Blue", 2013, 20_543);
        Car car3 = new Car("Bentley", "Black", 2025, 1_120_543);

        printCar(car1);
        printCar(car2);
        printCar(car3);
    }

    public static void printCar(Car car) {
        System.out.println("Brand: " + car.brand + ", Color: " + car.color + ", Production year: " + car.prodYear + ", Price: " + car.price + " Dollars");

    }
}

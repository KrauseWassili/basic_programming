package Task1;

import java.util.Scanner;

public class Pet {
    String type;
    String name;
    String color;
    int age;

    public Pet(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return type + " " + name + " " + color + " " + age + " лет (года)";
    }

    public static Pet enterNewPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип животного (кот, собака, попугай или др.): ");
        String type = scanner.nextLine();
        System.out.println("Введите кличку животного: ");
        String name = scanner.nextLine();
        System.out .println("Введите цвет животного: ");
        String color = scanner.nextLine();
        System.out.println("Введите возраст животного: ");
        int age = scanner.nextInt();
        System.out.println("---------------------------\n");

        return new Pet(type, name, color, age);
    }


}

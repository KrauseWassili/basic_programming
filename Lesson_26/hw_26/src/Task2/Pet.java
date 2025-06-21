package Task2;

import java.util.Scanner;

public class Pet {
    String type;
    String name;
    String color;
    int age;
    int petsArrSize;
    int petsIndex = 0;
    Pet[] petsArr = new Pet[petsArrSize];

    public Pet(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return type + " " + name + " " + color + " " + age + " лет (года)";
    }


    public static Pet enterNewPet(int num) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные о животном №" + (num+1) + ". Или введите 0 для выхода:");
        System.out.println("Введите тип животного (кот, собака, попугай или др.): ");
        String type = scanner.nextLine();
        if(type.equals("0")){                                       //Если хотим досрочно покинуть ввод / больше животных не осталось
            return new Pet("0", "", "", 0);
        }
        System.out.println("Введите кличку животного: ");
        String name = scanner.nextLine();
        if(name.equals("0")){
            return new Pet("0", "", "", 0);
        }
        System.out .println("Введите цвет животного: ");
        String color = scanner.nextLine();
        if(color.equals("0")){
            return new Pet("0", "", "", 0);
        }
        System.out.println("Введите возраст животного: ");
        int age = scanner.nextInt();
        System.out.println("---------------------------\n");

        return new Pet(type, name, color, age);
    }

    public static void enterPetsArr(Pet[] petsArr, int petsArrSize) {
        int i = 0;
        while (i < petsArrSize) {
            petsArr[i] = enterNewPet(i);
            if (petsArr[i].type.equals("0")){ //Досрочное прерывание ввода
                break;
            }
            i++;
        }
    }

    public static void printPetsArr(Pet[] petsArr, int petsArrSize) {
        int i = 0;
        while (i < petsArrSize) {
            System.out.println(petsArr[i]);
            i++;
            if(petsArr[i].type.equals("0")){
                break;
            }
        }
    }

    public static void ageStatistic(Pet[] petsArr, int petsArrSize){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип животного для вычисления среднего возраста:");
        String petType = scanner.nextLine();

        int i = 0;
        int Summ=0;
        while (i < petsArrSize) {

            if(petsArr[i].type.equals(petType)){
                Summ+=petsArr[i].age;
            }

            i++;
            if(petsArr[i].type.equals("0")){        //"0" в типе животного означает конец расчета, иначе считаем статистику по всему массиву
                break;
            }

        }
        System.out.println("Средний возраст животного типа " + petType + " составляет " + Summ / i + " лет (года).");
    }
}

package app;

public class Main {

    public static void main(String[] args){

        int numberOfPeopleInGroup = 14;
        double weightOfCat = 4.8;
        int numberOfPeopleInSubgroup = 4;
        byte numberOfDay;

        numberOfDay = 1;


        System.out.println("Количество людей " + numberOfPeopleInGroup);
        System.out.println("Вес кота " + weightOfCat);

        weightOfCat += 1; // weightOfCat = weightOfCat + 1;

        System.out.println("Новый вес кота " + weightOfCat); //Зеленый текст называется текстовым литералом

        int numberOfSubGroups = numberOfPeopleInGroup / numberOfPeopleInSubgroup; //целочисленное деление

        System.out.println("Количество подгруп:" + numberOfSubGroups);


        int a = 17;
        int b = 5;

        int res1 = a / b;       // целочисленное деление
        int reminder = a % b; // остаток от деления

        System.out.println("res1: " + res1);
        System.out.println("Остаток от деления: " + reminder);


        double x = 17;  // автокастинг целого числа в дробное
        double y = 5;

        double res2 = x / y;

        System.out.println("res2: " + res2);

    }
}

//Clean code -Martin - книга по чистому написанию программного кода
/*
Примитивные типы таных
byte
short
int
long
float
double
char
boolean
*/
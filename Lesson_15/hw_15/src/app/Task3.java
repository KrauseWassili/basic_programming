/*
Wassili Krause HW_15_3 cochort_68M

Задание 3 (чуть сложнее)
Исходные данные: есть длина и ширина комнаты, площадь паркета в одной упаковке. Напишите программу, которая запрашивает эти данные у пользователя, сохраняет эти данные в переменных, вычисляет и выводит в консоль, сколько упаковок паркета необходимо купить для этой комнаты.

Например:

Длинна комнаты: 4.0
Ширина комнаты: 3.0
В одной упаковке: 3.5 метра

Площадь комнаты 12 м.  необходимо 4 упаковки
Copy
Подсказка: здесь вам может пригодится преобразовать double - количество упаковок получившееся при расчетах , к int
 */

package app;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину комнаты: ");
        double roomLength = scanner.nextDouble();           //Если принимаем из консоли только числа, не обязательно очищать буфер.


        System.out.println("Введите ширину комнаты: ");
        double roomWidth = scanner.nextDouble();


        System.out.println("Введите площадь паркета в отдной упаковке: ");
        double areaPerPackage = scanner.nextDouble();

        double roomArea = roomLength * roomWidth;
        int requiredNumberOfPackages = (int) Math.ceil(roomArea / areaPerPackage); // пришлось подсмотреть, как делается округление вверх...

        //или можно добавить значение меньше 1:
        //int requiredNumberOfPackages = (int) (roomArea / areaPerPackage + 0.9999);

        System.out.println("Длина комнаты: " + roomLength);
        System.out.println("Ширина комнаты: " + roomWidth);
        System.out.println("В одной упаковке: " + areaPerPackage + " кв.м.");
        System.out.println("\nПлощадь комнаты: " + roomArea + ". Необходимо " + requiredNumberOfPackages + " упаковки.");
    }
}
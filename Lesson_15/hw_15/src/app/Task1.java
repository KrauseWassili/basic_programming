/*
Wassili Krause HW_15_1 cochort_68M

Задание 1
Ваша программа должна (используя Scanner) запросить

возраст пользователя
имя пользователя
Именно в таком порядке, сначало возраст потом имя.
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Jack (20)
Copy
Естественно, в результат должны подставится введенные данные.

 */

package app;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст пользователя: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите имя пользователя: ");
        String userName = scanner.nextLine();

        System.out.println(userName + " (" + userAge + ")");
    }
}


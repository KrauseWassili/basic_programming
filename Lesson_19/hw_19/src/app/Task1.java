/*
Wassili Krause HW_19_1 cochort_68M

Задача 1
Пользователь водит строку. Ваша задача получить новую строку, которая будет состоять из букв исходной, стоящих на нечетных позициях. Например:

Ввод: "java is very easy"
Вывод: "aai eyes"
Copy
или

Ввод: "0123456"
Вывод: "135"
 */

package app;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        int i=0;
        while (i < inputString.length()) {
            if (i%2!=0){
                System.out.print(inputString.charAt(i));
            }
            i++; //или int i = 1; в цикле i+=2, тогда можно без if и сэкономить на итерациях.
        }

    }
}

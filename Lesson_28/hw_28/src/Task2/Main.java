/*
Задача 2
Используя класс ListArray реализовать следующую программу: Пользователь вводит строки.
Как только пользователь ввел строку Exit ваша программа должна вывести на экран все введенные пользователем строки,
пюс сформировать статистику:

сколько всего строк введено
какая самая длинная строка
какая самая короткая строка
*/

package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();


        System.out.println("Введите строки. Для завершения введите 'Enter'.");
        enterStrings(stringArr);
        System.out.println("Вы ввели следующие строки:" + System.lineSeparator() + stringArr);

        System.out.println("В массиве содержится " + stringArr.size() + " строк(и).");
        System.out.println("Строка \"" + longestString(stringArr) + "\" самая длинная.");
        System.out.println("Строка \"" + shortestString(stringArr) + "\" самая короткая.");

    }

    public static String longestString(ArrayList<String> stringArr){
        String res = stringArr.get(0);
        for (int i = 0; i < stringArr.size(); i++) {
            if(res.length() < stringArr.get(i).length()){
                res = stringArr.get(i);
            }
        }
        return res;
    }

    public static String shortestString(ArrayList<String> stringArr){
        String res = stringArr.get(0);
        for (int i = 0; i < stringArr.size(); i++) {
            if(res.length() > stringArr.get(i).length()){
                res = stringArr.get(i);
            }
        }
        return res;
    }

    public static void enterStrings(ArrayList<String> stringArr) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputString = scanner.nextLine();
            if (!inputString.equals("Exit")) {
                stringArr.add(inputString);
            } else {
                break;
            }
        }
    }


}

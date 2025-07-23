/*
1
Создайте метод, который просит пользователя ввести email. Email считается корректным, если:
в нем не менее 5 символов, есть один символ ‘@’, он не должен быть первым или последним.
Создайте свой NotCorrectEmailFormatException
Если пользователь ввел некорректную строку метод должен выкидывать  NotCorrectEmailFormatException.
В main сделайте обработку Exception

2
Доработайте первую задачу так, чтобы в случае некорректного ввода,
пользователь получал бы информацию о всех невыполненных требованиях, т.е. например,
система должна сообщать, что “строка короче 5 символов, @ не должна быть последней” а не только какое то одно из условий

*/

package app;

import app.exceptions.InvalidEmailLengthException;
import app.exceptions.MissingAtSymnolException;
import app.exceptions.NotCorrectAtPlaceException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String Email = "";
        while (true) {
            try {
                Email = enterEmail();
                System.out.println("Спасибо! " + Email + " - это корректный адрес.");
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static String enterEmail (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите E-Mail:");
        String res = scanner.nextLine();

        if(!res.contains("@")) {
            throw new MissingAtSymnolException(res + " - строка адреса E-mail должна содержать символ '@'");
        }
        if(res.charAt(0) == '@'|| res.charAt(res.length()-1)=='@') {
            throw new NotCorrectAtPlaceException(res + " - символ @ не должен быть первым или последним в строке адреса E-mail.");
        }
        if(res.length()<5) {
            throw new InvalidEmailLengthException(res + " - длина строки адреса E-mail должна быть минимум на " + (5-res.length()) + " символ(а) длиннее.");
        }
        return res;
    }
}

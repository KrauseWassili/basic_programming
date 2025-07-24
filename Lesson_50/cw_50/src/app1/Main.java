package app1;

import app1.exceptions.NotCorrectEmailFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String email = null;

        while (email == null) {
            try {
                email = getEmail();
            } catch (NotCorrectEmailFormatException e) {
                System.out.println("Ошибка ввода email: " + e.getMessage());
                System.out.println("Повторите ввод");

            }
        }
        System.out.println("Email: " + email);
    }

    public static String getEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email");

        String email = scanner.nextLine().trim();
        // проверки
        if (email.length()<5){
            throw new NotCorrectEmailFormatException("Некорректная длинна");
        }
        int indexAt = email.indexOf('@');
        if(indexAt == -1){
            throw new NotCorrectEmailFormatException("Нет '@'");
        } else {

            if (indexAt != email.lastIndexOf('@')) {
                throw new NotCorrectEmailFormatException("Не может быть более одного символа '@'");
            }
            if (email.startsWith("@")){
                throw new NotCorrectEmailFormatException("Не может начинаться с символа '@'");
            }
            if (email.endsWith("@")){
                throw new NotCorrectEmailFormatException("Не может заканчиваться символом '@'");
            }

        }
        return email;
    }


}

/*
1
Создайте метод, который просит пользователя ввести email. Email считается корректным, если:
в нем не менее 5 символов,
есть один символ  ‘@’, он не должен быть первым или последним
Создайте свой NotCorrectEmailFormatException
Если пользователь ввел некорректную строку метод должен выкидывать  NotCorrectEmailFormatException.
В main сделайте обработку Exception


2
Доработайте первую задачу так, чтобы в случае некорректного ввода,  пользователь получал бы информацию о всех невыполненных требованиях, т.е. например, система должна сообщать, что “строка короче 5 символов, @ не должна быть последней” а не только какое то одно из условий

 */
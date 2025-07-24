/*
1.
a) Напишите программу, которая позволяет пользователю вводить с клавиатуры строки и записывает эти строки в файл.
Для выхода из программы, пользователь должен ввести строку “exit”.
В итоге должен быть файл со всеми введенными строками.
b) Ваша программа должна прочитать сформированный файл и вывести его содержимое на экран.
*/
package app;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки для записи в файл. Для завершения введите \"exit\"");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file1.txt"))) {
            while (true) {
                String string = scanner.nextLine();
                if (string.equalsIgnoreCase("exit")) break;
                writer.write(string + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи файла!");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("file1.txt"))){
            System.out.println("Файл содержит следующие строки:");
            String line;
            while ((line = reader.readLine())!=null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Ошибка чтения файла!");
        }


    }


}

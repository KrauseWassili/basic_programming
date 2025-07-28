/*
3. (По желанию) В файле второй задачи могут быть ошибки. Например:
строка может не содержать всех необходимых полей 	(“john,21” или “john”)
email задан некорректно (нет @, более одной @ и т.д. как мы делали)
возраст задан некорректно (“john,rte,lena@mail.com”)

Ваша программа должна:
1. получить список Person из корректных строк
2. вывести протокол обработки, т.е. в каких строках, какие ошибки были.
3. отсортировать список по возрасту, если возраст совпадает, то по имени,
4. удалить, если есть, повторяющиеся записи
5. записать в файл результат.


*/

package app2;

import app2.exceptions.IncorrectPersonStringException;
import app2.model.Person;
import app2.model.PersonList;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = FileToStringList("file3.txt");


        System.out.println("Строки исходного файла");
        System.out.println(stringList + System.lineSeparator());

        try {
            StringListToPersonList(stringList);
        } catch (IncorrectPersonStringException e) {
            System.out.println(e.getMessage());
        }

        List<Person> personList1 = PersonList.getPersonList().stream()
                .distinct()
                .sorted(Comparator.comparing(Person::getAge))
                .toList();


        PersonListToFile("file4.txt", personList1);
        System.out.println("\nСтроки финального файла");
        System.out.println(FileToStringList("file4.txt")); //

    }

    public static void PersonListToFile(String fileName, List<Person> personList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for (Person person : personList) {
                String str = String.format("%s,%s,%s", person.getName(), person.getAge(), person.getEmail());
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи файла!" + e.getMessage());
        }
    }

    public static List<String> FileToStringList(String fileName) {
        List<String> res = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines().toList();
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения файла! " + e.getMessage());
        }
    }


    public static void StringListToPersonList(List<String> stringList) {
        List<String> errorList = new ArrayList<>();
        for (String string : stringList) {
            String[] splitedString = null;
            try {
                splitedString = string.split(",");

                if (!splitedString[2].contains("@"))
                    errorList.add("В строке \"" + string + "\" в адресе почты отсутствует символ '@'");
                else if (splitedString[2].indexOf("@") != splitedString[2].lastIndexOf("@"))
                    errorList.add("В строке \"" + string + "\" в адресе почты более, чем один символ '@'");
                else
                    PersonList.add(new Person(splitedString[0], Integer.parseInt(splitedString[1]), splitedString[2]));  //Пишем во внешний класс, чтобы не потерять данные при выбросе ошибок
            } catch (NumberFormatException e) {
                errorList.add("В строке \"" + string + "\" Неверный формат возраста");
            } catch (ArrayIndexOutOfBoundsException e) {
                errorList.add("В строке \"" + string + "\" неверное количество полей");
            }

        }
        if (!errorList.isEmpty())
            throw new IncorrectPersonStringException(errorList);
    }


}

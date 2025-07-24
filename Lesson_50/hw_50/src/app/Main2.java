/*
2.
Пусть дан текстовый файл, с информацией о Person
~~~
jack,32,jack@mail.com
john,21,john@mail.com
ann,5,ann@mail.com
lena,17,lena@mail.com
~~~
т.е. имя, возраст, email . Ваша задача получить список Person
 */

package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("file2.txt"))){
            String line;
            while ((line = reader.readLine())!=null){
                String [] lineSplited = line.split(",");
                personList.add(new Person(lineSplited[0],Integer.parseInt(lineSplited[1]),lineSplited[2]));
            };
        }catch (IOException e){
            System.out.println("Ошибка чтения файла!");
        }

        System.out.println(personList);
    }
}

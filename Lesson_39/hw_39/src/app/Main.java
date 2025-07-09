/*
Задание 1
Допустим дан список строк. Используя итератор реализуйте следующие методы:

метод String join(List list), который в качестве результата возвращает строку,
полученную соединением всех строк исходного списка через запятую.
Пример ["jack","ann","kim"] -> jack,ann,kim

Удаляет из исходного списка все строки короче 3 символов


Задание 2 (по желанию)
В проекте с нашей реализацией листов, реализуйте Iterator у MyArrayList
 */

package app;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of("jack", "ann", "kim","li","isabel"));


        System.out.println(join(stringList));   //формируем строку из элементов списка

        deleteShorterThen3(stringList);         //удаляем из списка строки, длина которых короче 3х.
        System.out.println(stringList);

    }

    public static void deleteShorterThen3 (List<String> stringList) {
        if (!stringList.isEmpty()) {
            Iterator<String> iterator = stringList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                if(element.length()<3){
                    iterator.remove();
                }
            }
        }
    }

    public static String join(List<String> stringList) {
        if (!stringList.isEmpty()) {
            Iterator<String> iterator = stringList.iterator();
            String res = iterator.next(); // сразу пишем первый элемент, чтобы затем в цикле добавлять "," перед каждым следующим элементом.
            while (iterator.hasNext()) {
                res += "," + iterator.next();
            }
            return res;
        } else {
            return null;
        }
    }
}

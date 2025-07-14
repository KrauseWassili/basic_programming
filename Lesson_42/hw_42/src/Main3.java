/*
3 (по желанию)

Дана длинная строка, в которой нет знаков препинания, все слова разделены пробелом.
Необходимо получить Map<String, Integer> где ключ, слово из строки, значение - сколько раз это слово встречается
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        String string = "qwe rtzu iopü+ asd fgh jklö yxc vbn m,.-y qwe rtzu asd asd jklö vbn";
        String[] stringArray = string.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        fillMap(map,stringArray);
        printMap(map);
    }

    public static void fillMap(Map<String, Integer> map, String[] stringArray) {
        int newValue = 0;
        for (String string : stringArray) {
            if (!map.containsKey(string))       //если по мере заполнения выясняется, что ключ в map уже есть, то заменяем его значение на false.
                map.put(string, 1);
            else
                newValue = map.get(string);
            map.put(string, newValue + 1);
        }
    }
    public static void printMap(Map<String, Integer> map) {
        for (var key: map.keySet()){
            System.out.println("key: " + key + ";\t value: " + map.get(key));
        }
    }
}

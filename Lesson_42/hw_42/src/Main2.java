/*
2
Дан лист строк, необходимо получить Map<String,Boolean>,  где ключ, это строка, а значение
true - если строка встретилась в листе только один раз,
false - если встретилась больше одного раза
*/

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of(
                "string1",
                "string2",
                "string3",
                "string4",
                "string5",
                "string3"
        ));

        Map<String, Boolean> map = new LinkedHashMap<>();
        fillMap(map, stringList);
        printMap(map);

    }

    public static void printMap(Map<String, Boolean> map) {
        for (var key: map.keySet()){
            System.out.println("key: " + key + "; value: " + map.get(key));
        }
    }

    public static void fillMap(Map<String, Boolean> map, List<String> stringList) {
        boolean value = false;
        for (String string : stringList) {
            if (!map.containsKey(string))       //если по мере заполнения выясняется, что ключ в map уже есть, то заменяем его значение на false.
                value = true;
            else
                value = false;

            map.put(string, value);
        }
    }
}

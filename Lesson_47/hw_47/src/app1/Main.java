/*
1. Дан лист строк, нужно получить Map<String, Boolean>, где ключ - строка, значение - true,
если строка встретилась более одного раза, иначе false
Естественно, решить используя Stream.


*/

package app1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("String1", "String2", "String3", "String2", "String5", "String6", "String1");


        Map<String,Boolean> stringMap = stringList.stream()
                .collect(Collectors.toMap(s->s,s->false, (v1,v2)->true));
        stringMap.forEach((k,v)->System.out.println(k+" "+v));

    }
}


/*
1
Напишите метод, который принимает map<String,Integer>, и две строки key1 и key2
Если в map есть заданные ключи key1 и key2, то метод должен сформировать в map новый ключ из строки (key1+”-”+key2)
и положить туда сумму значений. Если какого-то из ключей нет, map остается без изменения.
Вывести на экран получившуюся Map столбиком:
ключ:значение

Примечание: Метод void, т.е. он не возвращает новый map а изменяет переданный в параметрах.

Пример:
Map:{
   “jack”,10
   “john”,5
}
Вызываем метод с ключами “jack” и “john”, получаем:
Map:{
   “jack”,10
   “john”,5
   “jack_john”:15
}
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("key1",1);
        map.put("key2",2);
        map.put("key3",3);
        map.put("key4",4);
        map.put("key5",5);

        System.out.println(map);
        transformMat(map,"key1","key3");
        System.out.println(map);

    }
    public static void transformMat(Map<String,Integer> map,String key1,String key2){
        if (map.containsKey(key1) && map.containsKey(key2)) {
            String newKey = key1 + "_" + key2;
            int newValue = map.get(key1) + map.get(key2);
            map.put(newKey,newValue);
        }
    }
}

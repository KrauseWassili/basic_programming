/*
#2 (По желанию) Если хотите подумать, только чур не искать на просторах интернета: дана строка из скобок,
например ( [] {} )[ ( { () } ) ] . В строке могут быть символы кроме скобок, они нас не интересуют.
Как видите, скобки могут встречаться трех видов () [] {} Необходимо проверить корректность расстановки скобок.
Т.е. закрытые-открытые, вложенность и т.д. Спойлер: задача несложная, важно придумать подход
 */

package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "( [] {} )[ ( { () } ) ]";

        System.out.println(isBracketsCorrect(stringToIntegerList(string)));
    }

    public static List<Integer> stringToIntegerList(String string) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {         //Формируем строку типа Integer для дальнейшей проверки правильности расстановки скобок
            switch (string.charAt(i)) {
                case '(':
                    res.add(1);
                    break;
                case '[':
                    res.add(2);
                    break;
                case '{':
                    res.add(3);
                    break;
                case ')':
                    res.add(-1);
                    break;
                case ']':
                    res.add(-2);
                    break;
                case '}':
                    res.add(-3);
                    break;
                default:
            }
        }
        return res;
    }

    public static boolean isBracketsCorrect(List<Integer> integerList) {
        List<Integer> integerListTemp = new ArrayList<>(integerList);                               //Создаем копию листа
        if (integerListTemp.getFirst() > 0 && integerListTemp.size() % 2 == 0) {                    //Если первая скобка открывающаяся и общее количество скобок четное, то продолжаем
            while (!integerListTemp.isEmpty() && integerListTemp.getFirst() > 0) {                  //Обрабатываем лист, пока он не опустеет или пока первая скобка не окажется закрывающейся (ошибка расстановки)
                for (int i = 0; i < integerListTemp.size(); i++) {                                  //В данном цикле ищем рядом стоящие пары одинаковых скобок и зануляем их
                    if (integerListTemp.get(i) < 0 && integerListTemp.get(i) + integerListTemp.get(i - 1) == 0) {
                        integerListTemp.set(i, 0);
                        integerListTemp.set(i - 1, 0);
                    }
                }
                List<Integer> integerListTemp1 = integerListTemp.stream()                           //В стриме отсеиваем нули, полученные в цикле for
                        .filter(i -> !i.equals(0))
                        .toList();

                if (!integerListTemp.equals(integerListTemp1))
                    integerListTemp = new ArrayList<>(integerListTemp1);                            //Обновляем обрабатываемый список
                else
                    break;                                                                          //Если лист после обработки не изменился, значит скобки еще остались, но рядом стоящие пары закончились
            }                                                                                       //А это уже ошибка
        }
        return integerListTemp.isEmpty();           //Если лист пустой, то все ок (каждая скобка нашла свою пару), если не пустой, значит есть ошибки в расстановке.
    }
}


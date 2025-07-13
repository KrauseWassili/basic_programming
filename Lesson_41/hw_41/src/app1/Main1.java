/*
1. Дан лист String. Необходимо определить, есть ли в данном листе повторяющиеся строки.
*/

package app1;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>(List.of(
                "qwer","asdf","yxcv","tzui","ghjk","bnm"
        ));

        System.out.println(stringList);
        System.out.println("Есть ли в листе повторяющиеся строки? " + isDuplicationInList(stringList));

    }

    public static boolean isDuplicationInList (List<String> stringList){
        Set<String> stringSet = new LinkedHashSet<>(stringList);
        return stringList.size() != new ArrayList<>(stringSet).size();
    }
}

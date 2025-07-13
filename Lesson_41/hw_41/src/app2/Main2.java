
/*
2. Дана строка с именами вида Jack,John,Nick,John. Необходимо написать метод,
который удалит из этой строки повторяющиеся имена.
Т.е. например, в случае строки  “Jack,John,Nick,John” вернет строку  с именами  Jack,John,Nick
 */
package app2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        String string = "Jack,John,Nick,John";

        System.out.println(string);
        System.out.println(removeDuplicationFromString(string));
    }

    public static String removeDuplicationFromString(String string) {
        return setToString(stringToSet(string));
    }

    public static Set<String> stringToSet(String string) {
        Set<String> res = new HashSet<>();
        String tempString = "";
        for (int i = 0; i <= string.length(); i++) {
            if (i < string.length() && string.charAt(i) != ',') {
                tempString += string.charAt(i);
            } else {
                res.add(tempString);
                tempString = "";
            }
        }
        return res;
    }

    public static String setToString(Set<String> stringSet) {
        String res = "";

        int i = 0;
        for (String tempString : stringSet) {
            res += tempString;
            if (++i < stringSet.size()) {
                res += ",";
            }
        }
        return res;
    }
}

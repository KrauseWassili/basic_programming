package app;

public class Main3 {
    public static void main(String[] args){

        String myString = "hallo Java";
        int stringLength = myString.length();
        String toUpperCase = myString.toUpperCase();
        String toLowerCase = myString.toLowerCase();


        System.out.println("Строка: " + myString);
        System.out.println("Длина строки: " + stringLength);
        System.out.println("Строка заглавными буквами: " + toUpperCase);
        System.out.println("Строка строчными буквами: " + toLowerCase);
        System.out.println("Первый символ (char) в строке: " + myString.charAt(0));
        System.out.println("Второй символ (char) в строке: " + myString.charAt(1));
        int LastIndex = myString.length()-1;
        System.out.println("Последний символ (char) в строке: " + myString.charAt(LastIndex));

        int firstSpaceIndex = myString.indexOf(" "); // indexOf - поиск в строке
        int lastSpaceIndex = myString.lastIndexOf(" "); // lastIndexOf - поиск в строке
        System.out.println("Первый пробел имеет индекс: " + firstSpaceIndex);

        System.out.println("Слово Java начинается с: " + myString.indexOf("Java")); //Если нет совпадений, то выводит -1


        // substring - получить часть строки
        String s1 = myString.substring(4);
        System.out.println(s1);
        String s2 = myString.substring(1,4);
        System.out.println(s2);
    }
}

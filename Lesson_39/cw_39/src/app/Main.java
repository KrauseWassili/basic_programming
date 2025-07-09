package app;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList<Person> personList = new MyArrayList<>();
        personList.add(new Person("Jack",23));
        personList.add(new Person("Ann",22));
        personList.add(new Person("Mike",28));
        personList.add(new Person("Nick",21));


        System.out.println(personList);
        System.out.println("Размер листа: " + personList.size());
        System.out.println("Элемент с индексом 0: " + personList.get(0));
        System.out.println("Последний элемент: " + personList.get(personList.size()-1));


        System.out.println("---------- iterator ----------");
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            Person element = iterator.next();
            System.out.println(element);
        }

    }
}
package app;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "John", "Ann", "Peter","Jack");
        Map<Integer, Set<String>> collect = list.stream().
                collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(collect);

        Map<Integer, Long> collect1 = list.stream().
                collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(collect1);

    }
}

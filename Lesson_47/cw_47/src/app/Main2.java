package app;



import model.Task;

import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        // joining() - объединение строк. Только для String
        List<String> list = List.of("Jack", "John", "Ann", "Peter","Jack");
        String collect1 = list.stream()
                .collect(Collectors.joining(";", "start:", ":finish"));

        System.out.println(collect1);


        /*

         */

        Map<String, Integer> map1 = list.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length(), (i1,i2)-> i1 ));
        System.out.println(map1);

        List<Task> tasks = List.of(
                new Task(1, "Fix login bug", "in progress", 5),
                new Task(2, "Implement payment", "finish", 10),
                new Task(3, "Update login module", "finish", 8),
                new Task(4, "Update config", "in progress", 2)
        );

        Map<String, String> map2 = tasks.stream()
                .collect(Collectors.toMap(Task::getStatus,
                        t -> String.valueOf(t.getNumber()),
                        (n1,n2) -> n1+"|"+n2
                ));
        System.out.println(map2);


        Map<String, List<Task> > map3 = tasks.stream()
                .collect(Collectors.groupingBy(Task::getStatus));
        map3.forEach((k,v)-> System.out.println(k+":"+v));

        System.out.println(list.stream().distinct().collect(Collectors.groupingBy(String::length)));

        Map<Boolean, List<String>> map5 = list.stream().collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println(map5);

        System.out.println(tasks.stream()
                .collect(Collectors.partitioningBy(t -> !t.getStatus().equals("finish"))));



    }
// Function<T,R>
// Predicate<T>
// UnaryOperator<T>
// Consumer<T>
// Supplier<T>

}
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Random rnd = new Random();
        rnd.ints().takeWhile(i->i>0).forEach(System.out::println);

         */
        List<Integer> list = new ArrayList<>();
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        //Integer i = min.get(); // получить значение из Optional (может вернуть значение или Exception)
        Integer result = min.orElse(0);

        System.out.println(result);


        System.out.println(min);

        String str = stringToUpperCase("hell").orElse("");
        System.out.println(str);

    }

    public static Optional<String> stringToUpperCase(String s){
        if (s==null){
            return Optional.empty();
        } else {
            return Optional.of(s.toUpperCase());
        }
    }


}

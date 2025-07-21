/*
4. (По желанию) Дан список выплат в виде списка строк: "Jack:1110.00", "Nick:220.50", "Jack:1300.20"....
Необходимо получить Map<String, Double> где ключ это имя, а значение - сумма выплат.
Пример:
("Jack:1110.00", "Nick:220.50", "Jack:1300.20") -> {Nick=220.5, Jack=2410.2}
*/

package app4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("Jack:1110.00",
                "Nick:220.50",
                "Jack:1300.20",
                "Emily:5400.75",
                "Anna:199.99",
                "Nick:310.25",
                "John:825.00",
                "Laura:150.10",
                "Emily:3300.45",
                "David:440.00"
        );

        System.out.println(stringList.stream()
                .collect(Collectors.toMap(
                        s -> s.split(":")[0],
                        s -> Double.parseDouble(s.split(":")[1]),
                        Double::sum
                )));

    }
}

package app;

import model.Programmer;
import model.Task;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Programmer> programmers = List.of(
                new Programmer("Jack", "Berlin", List.of(
                        new Task(1, "Fix login bug", "in progress", 5),
                        new Task(2, "Implement payment", "done", 10),
                        new Task(3, "Update login module", "finish", 8)
                )),
                new Programmer("Anna", "Hamburg", List.of(
                        new Task(4, "Write documentation", "in progress", 2)
                )),
                new Programmer("John", "Berlin", List.of(
                        new Task(5, "Refactor user service", "done", 6),
                        new Task(6, "Update dependencies", "finish", 3),
                        new Task(7, "Remove deprecated code", "in progress", 4)
                )),
                new Programmer("Maria", "Cologne", List.of(
                        new Task(8, "Prepare release", "finish", 8),
                        new Task(9, "Analyze logs", "in progress", 2),
                        new Task(10, "Check reports", "in progress", 3),
                        new Task(11, "Fix API bug", "done", 4)
                )),
                new Programmer("Peter", "Dusseldorf", List.of(
                        new Task(12, "Fix mobile UI", "in progress", 4),
                        new Task(13, "Migrate database", "done", 7)
                )),
                new Programmer("Olga", "Frankfurt", List.of(
                        new Task(14, "Update README", "finish", 1),
                        new Task(15, "Bugfix CSS", "in progress", 5)
                )),
                new Programmer("Sergey", "Stuttgart", List.of(
                        new Task(16, "Optimize queries", "done", 9),
                        new Task(17, "Clean code review", "finish", 6)
                )),
                new Programmer("Ivan", "Dortmund", List.of(
                        new Task(18, "Fix auth service", "finish", 7),
                        new Task(19, "Update API docs", "finish", 4),
                        new Task(20, "Document endpoints", "in progress", 2)
                )),
                new Programmer("Nina", "Leipzig", List.of(
                        new Task(21, "Improve performance", "done", 12)
                )),
                new Programmer("Victor", "Hannover", List.of(
                        new Task(22, "Prepare demo", "finish", 5),
                        new Task(23, "Setup CI/CD", "in progress", 7),
                        new Task(24, "Integrate metrics", "done", 6),
                        new Task(25, "Fix security warnings", "finish", 8)
                ))
        );


        System.out.println("---------------------- Лист программистов -------- ");
        programmers.forEach(System.out::println);

        System.out.println("---------- 1 ---------------");
        System.out.println("Сформировать Map<String, Integer> где ключ, это имя программиста, а значение количество задач в списке у данного программиста.");

        Map<String, Integer> mapProgrammerNameTaskCount = programmers.stream()
                .collect(Collectors.toMap(Programmer::getName, p -> p.getTasks().size()));

        mapProgrammerNameTaskCount
                .forEach((name, taskCounter) -> System.out.println(name+": " +taskCounter) );

        System.out.println();
        System.out.println("Сформировать список всех задач,  " +
                "которые относятся к программистам из Berlin, " +
                "отсортированный по количеству дней в обработке ( daysInProcessing). " +
                "В списке не должны присутствовать уже закрытые задачи (status = “finish”)");

        List<Task> allBerlinNotFinishTasks = programmers.stream()
                .filter(p -> p.getCity().equals("Berlin"))
                .flatMap(p -> p.getTasks().stream())  /// был Stream<Programmer> -> стал Stream<Task>
                .filter(t -> !t.getStatus().equals("finish"))
                //.sorted((t1, t2) -> Integer.compare(t1.getDaysInProcessing(), t2.getDaysInProcessing()))
                .sorted(Comparator.comparing(Task::getDaysInProcessing).reversed())
                .toList();
        allBerlinNotFinishTasks.forEach(System.out::println);

        System.out.println();
        System.out.println("Сформировать список сет задач,  которые относятся к " +
                "программистам не из Berlin,  " +
                "daysInProcessing у них больше 5 и статус не “finish”");

        Predicate<Task> moreThenFifeDaysInProcessing = t -> t.getDaysInProcessing() > 5;
        Predicate<Task> notFinish = t -> !t.getStatus().equals("finish");
        List<Task> tasksNotBerlinNotFinish = programmers.stream()
                .filter(p -> !p.getCity().equals("Berlin"))
                .flatMap(p -> p.getTasks().stream())
                //.filter(t -> t.getDaysInProcessing() > 5 &&  !t.getStatus().equals("finish"))
                .filter(moreThenFifeDaysInProcessing.and(notFinish))
                .toList();

        tasksNotBerlinNotFinish.forEach(System.out::println);


        System.out.println();
        System.out.println("Сформировать Map<Task, Programmer> где ключ, задача, " +
                "значение - программист, ответственный за задачу");
        class TaskWithProgrammer{
            private Task task;
            private Programmer programmer;

            public TaskWithProgrammer(Task task, Programmer programmer) {
                this.task = task;
                this.programmer = programmer;
            }
        }

        Map<Task, Programmer> mapTaskProgrammer = programmers.stream()
                .flatMap(programmer -> programmer.getTasks().stream()
                        .map((task) -> new TaskWithProgrammer(task, programmer)))
                .collect(Collectors.toMap(t -> t.task, t -> t.programmer));

        mapTaskProgrammer.forEach((k,v)-> System.out.println(k+":"+v.getName()));


        // второй вариант
        Map<Task, Programmer> map = programmers.stream()
                .flatMap(p -> p.getTasks().stream().map(task -> Map.entry(task, p)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }


}


/*
Дан список Programmer(String name, String city, List<Task>  tasks). Каждый программист  имеет список задач    Task (int Number, String description, String status, int daysInProcessing) . В  данной задаче имя программиста уникально и не повторяется, список задач не пустой и в нем нет null значений

    1.
 Сформировать Map<String, Integer> где ключ, это имя программиста, а значение количество задач в списке у данного программиста.

2.
Сформировать список всех задач,  которые относятся к программистам из Berlin, отсортированный по количеству дней в обработке ( daysInProcessing). В списке не должны присутствовать уже закрытые задачи (status = “finish”)

3
Сформировать список сет задач,  которые относятся к программистам не из Berlin,  daysInProcessing у них больше 5 и статус не “finish”

    4 (Сложная**, по желанию)
 Сформировать Map<Task, Programmer> где ключ, задача, значение - программист, ответственный за задачу




 */

/*
Дан список Programmer(String name, String city, List<Task> tasks). Каждый программист имеет список задач
Task (int Number, String description, String status, int daysInProcessing).
В данной задаче имя программиста уникально и не повторяется, список задач не пустой и в нем нет null значений

1. Сформировать Map<String, Integer> где ключ, это имя программиста, а значение количество задач в списке у данного программиста.

2. Сформировать список всех задач, которые относятся к программистам из Berlin,
отсортированный по количеству дней в обработке (daysInProcessing).
В списке не должны присутствовать уже закрытые задачи (status = “finish”)

3. Сформировать список сет задач, которые относятся к программистам не из Berlin,
daysInProcessing у них больше 5 и статус не “finish”

4 (Сложная**, по желанию)
Сформировать Map<Task, Programmer> где ключ, задача, значение - программист, ответственный за задачу
*/

package app;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Programmer> programmerList = List.of(
                new Programmer("John", "Düsseldorf",
                        List.of(
                                new Task("Fix login bug", "in work", 3),
                                new Task("Write unit tests", "finished", 8)
                        )),
                new Programmer("Emily", "Berlin",
                        List.of(
                                new Task("Create landing page", "in work", 4),
                                new Task("Fix navbar", "in work", 2),
                                new Task("Deploy to staging", "finished", 10)
                        )),
                new Programmer("Michael", "Hamburg",
                        List.of(
                                new Task("Refactor legacy code", "in work", 7),
                                new Task("Optimize SQL queries", "in work", 5),
                                new Task("Write documentation", "finished", 12),
                                new Task("Update diagrams", "finished", 6)
                        )),
                new Programmer("Sarah", "Berlin",
                        List.of(
                                new Task("Design database schema", "in work", 5),
                                new Task("Implement REST API", "in work", 9),
                                new Task("Fix CORS issues", "finished", 14),
                                new Task("Test endpoints", "in work", 7),
                                new Task("Deploy backend", "finished", 11)
                        )),
                new Programmer("David", "Cologne",
                        List.of(
                                new Task("Build admin dashboard", "in work", 6),
                                new Task("Add dark mode", "in work", 7),
                                new Task("Update dependencies", "finished", 11)
                        )),
                new Programmer("Laura", "Stuttgart",
                        List.of(
                                new Task("Setup CI/CD", "in work", 4),
                                new Task("Lint codebase", "in work", 5)
                        )),
                new Programmer("James", "Frankfurt",
                        List.of(
                                new Task("Fix UI glitches", "in work", 2),
                                new Task("Improve accessibility", "in work", 3),
                                new Task("Test mobile layout", "finished", 6),
                                new Task("Fix RTL support", "in work", 4)
                        )),
                new Programmer("Anna", "Bremen",
                        List.of(
                                new Task("Write Kafka consumer", "in work", 6),
                                new Task("Integrate Redis cache", "in work", 7),
                                new Task("Clean up logs", "finished", 9)
                        )),
                new Programmer("Robert", "Leipzig",
                        List.of(
                                new Task("Migrate to Spring Boot 3", "in work", 5),
                                new Task("Fix Jenkins pipeline", "in work", 8),
                                new Task("Check license compatibility", "finished", 13),
                                new Task("Write Dockerfile", "in work", 3)
                        )),
                new Programmer("Olivia", "Berlin",
                        List.of(
                                new Task("Research WebSockets", "in work", 3),
                                new Task("Prototype chat module", "in work", 6),
                                new Task("Merge pull requests", "finished", 7),
                                new Task("Write test plan", "in work", 5),
                                new Task("Sync with product team", "finished", 4)
                        ))
        );

        System.out.println("\n1. Сформировать Map<String, Integer> где ключ, это имя программиста, а значение количество задач в списке у данного программиста.");

        Map<String, Integer> programmerMap1 = programmerList.stream().collect(Collectors.toMap(Programmer::getName, p -> p.getTasks().size()));
        System.out.println(programmerMap1);

        System.out.println("\n2. Сформировать список всех задач, которые относятся к программистам из Berlin,\n" +
                "отсортированный по количеству дней в обработке (daysInProcessing).\n" +
                "В списке не должны присутствовать уже закрытые задачи (status = “finish”)");

        List<Task> taskList1 = programmerList.stream()
                .filter(p -> p.getCity().equals("Berlin"))
                .flatMap(p -> p.getTasks().stream())
                .filter(t -> !t.getStatus().equals("finished"))
                //.sorted((t1, t2) -> t1.getDaysInProcessing().compareTo(t2.getDaysInProcessing()))
                .sorted(Comparator.comparing(Task::getDaysInProcessing))
                .toList();
        taskList1.forEach(System.out::println);

        System.out.println("\n3. Сформировать список сет задач, которые относятся к программистам не из Berlin,\n" +
                "daysInProcessing у них больше 5 и статус не “finish”");

        //Predicate<Task> notFinished =

        Set<Task> taskSet1 = programmerList.stream()
                .filter(p -> !p.getCity().equals("Berlin"))
                .flatMap(p -> p.getTasks().stream())
                .filter(t -> !t.getStatus().equals("finished"))
                .filter(t -> t.getDaysInProcessing() > 5)
                .collect(Collectors.toSet());
        System.out.println(taskSet1);

        System.out.println("\n4 (Сложная**, по желанию)\n" +
                "Сформировать Map<Task, Programmer> где ключ, задача, значение - программист, ответственный за задачу");

       /* Map<Task, Programmer> programmerMap2 = programmerList.stream()
                .map(p -> taskMap(p.getTasks(), p))
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));*/

        class TaskWithProgrammer {
            private Task task;
            private Programmer programmer;

            public TaskWithProgrammer(Task task, Programmer programmer) {
                this.task = task;
                this.programmer = programmer;
            }
        }

        Map<Task, Programmer> programmerMap2 = programmerList.stream()
                        .flatMap(p->p.getTasks().stream()
                                .map(t-> new TaskWithProgrammer(t,p)))
                                .collect(Collectors.toMap(t->t.task,t->t.programmer));


        programmerMap2.forEach((k,v)->System.out.println(k+":"+v));


        Map<Task, Programmer> map = programmerList.stream()
                .flatMap(p -> p.getTasks().stream().map(task -> Map.entry(task, p)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


    }

    public static Map<Task, Programmer> taskMap(List<Task> taskList, Programmer programmer) {
        Map<Task, Programmer> res = new HashMap<>();
        for (Task task : taskList)
            res.put(task, programmer);
        return res;
    }
}

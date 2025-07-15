/*
1.
Дан список Programmer(String name,  List<Task>  tasks). Каждый программист  имеет список задач
Task (int Number, String description). Напишите метод, который сформирует Map< Programmer,
List<Task> > где ключ - программист, а значение список его задач.
*/
package app1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        List<Programmer> programmerList = new ArrayList<>(List.of(
                new Programmer("Ben", new ArrayList<>(List.of(
                        new Task(1, "write code"),
                        new Task(2, "check"),
                        new Task(3, "E-Mails")))),
                new Programmer("Sven", new ArrayList<>(List.of(
                        new Task(1, "send"),
                        new Task(2, "receive"),
                        new Task(3, "telephone")))),
                new Programmer("Patron", new ArrayList<>(List.of(
                        new Task(1, "check code"),
                        new Task(2, "receive E-Mail"),
                        new Task(3, "purchase")))),
                new Programmer("Jorge", new ArrayList<>(List.of(
                        new Task(1, "read"),
                        new Task(2, "consulting")))),
                new Programmer("Donald", new ArrayList<>(List.of(
                        new Task(1, "management"),
                        new Task(2, "support"),
                        new Task(3, "telephone"),
                        new Task(4, "transport"))))
        ));
        Map<String, List<Task>> map = new HashMap<>();

        writeToMap(programmerList, map);
        //printMap(map);
        System.out.println(map);
    }

    public static void writeToMap(List<Programmer> programmerList, Map<String, List<Task>> map) {
        for (Programmer programmer : programmerList) {
            map.put(programmer.getName(), programmer.getTasks());
        }
    }
/*
    public static void printMap(Map<String, List<Task>> map) {
        for (var entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Task task : entry.getValue()) {
                System.out.print(task.getNumber() + ". " + task.getDescription() + "; ");
            }
            System.out.print(System.lineSeparator());
        }
    }*/
}

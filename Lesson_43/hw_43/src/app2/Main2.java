package app2;/*
2.
Допустим, каждый раз, когда студент приходит на лекцию, преподаватель заносит его в список.
Таким образом, у вас есть список студентов, т.е. List<Student>,
в котором один и тот же студент может встречаться несколько раз.
Напишите метод, который сформирует Map<Student,Integer> где ключ - это студент,
а значение - сколько лекций он посетил
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(
                new Student("Boris", "Borisov"),
                new Student("Alina", "Selesnjova"),
                new Student("Boris", "Borisov"),
                new Student("Bogdan", "Shalashov"),
                new Student("Leonid", "Berjosin"),
                new Student("Galina", "Vetrova"),
                new Student("Leonid", "Berjosin"),
                new Student("Bogdan", "Shalashov"),
                new Student("Leonid", "Berjosin")
        ));
        Map<Student, Integer> studentMap = new HashMap<>();

        writeStudentsToMap(studentList, studentMap);
        System.out.println(studentMap);

    }

    public static void writeStudentsToMap(List<Student> studentList, Map<Student, Integer> studentMap) {
        for (Student student : studentList) {
            studentMap.put(student, studentMap.containsKey(student) ? studentMap.get(student) + 1 : 1);
        }
    }
}


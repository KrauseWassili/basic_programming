package app;

import app.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Петя Петров", "AA101"));
        studentList.add(new Student("Ирина Ирова", "AA101"));
        studentList.add(new Student("Сергей Сергеев", "AA101"));
        studentList.add(new Student("Иван Иванов", "ББ202"));
        studentList.add(new Student("Наталья Натальева", "ББ202"));
        studentList.add(new Student("Егор Егоров", "ББ202"));
        studentList.add(new Student("Григорий Григорьев", "ВВ303"));
        studentList.add(new Student("Раиса Раисова", "ВВ303"));
        studentList.add(new Student("Алевтина Алевтинова", "ВВ303"));

        System.out.println("В учебном заведении учится " + Student.getStudentsNumber() + " студентов");
        printStudentsByGroup(studentList,"ВВ303");
    }

    public static void printStudentsByGroup(List<Student> studentList,String group){
        System.out.println("В группе " + group + " учатся студенты:\n");
        for(Student student : studentList){
            if(student.getGroup().equals(group)) {
                System.out.println(student.getId() + ": " + student.getName());
            }
        }
    }
}

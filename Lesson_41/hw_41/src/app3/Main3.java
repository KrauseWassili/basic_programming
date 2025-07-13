/*
3. [по желанию] Руководство компании решило премировать сотрудников.
Каждый team lead подал список сотрудников для получения премии. Но получилось так,
что некоторые сотрудники работают на нескольких проектах и попали в списки несколько раз.
Итак, у вас есть массив из списков Employee.
Ваша задача помочь получить один общий список сотрудников, но без повторов.
*/
package app3;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        List<List<Employee>> employeeListArray = new ArrayList<>();

        employeeListArray.add(List.of(
                new Employee("Jack", "Jackson"),
                new Employee("Niel", "Nielson"),
                new Employee("John", "Johnson"),
                new Employee("Len", "Lenson"),
                new Employee("Frank", "Franklin")
        ));
        employeeListArray.add(List.of(
                new Employee("Ben", "Benson"),
                new Employee("Arthur", "Arthur-son"),
                new Employee("William", "Willson"),
                new Employee("Len", "Lenson"),
                new Employee("Frank", "Franklin")

        ));
        employeeListArray.add(List.of(
                new Employee("Ben", "Benson"),
                new Employee("Alex", "Alexson"),
                new Employee("Jen", "Jenson"),
                new Employee("Len", "Lenson"),
                new Employee("Nicolas", "Cage")

        ));
        List<Employee> employeeList = arrayToEmployeeList(employeeListArray);
        System.out.println(employeeList);

        List<Employee> finalEmployeeList = removeDuplicationFromList(employeeList);
        System.out.println(finalEmployeeList);
    }

    private static List<Employee> removeDuplicationFromList(List<Employee> employees) {
        Set<Employee> employeeSet = new HashSet<>(employees);
        return new ArrayList<>(employeeSet);
    }

    public static List<Employee> arrayToEmployeeList(List<List<Employee>> employeeListArray) {
        List<Employee> res = new ArrayList<>();
        for (List<Employee> employeeList : employeeListArray) {
            for (Employee employee : employeeList)
                res.add(employee);
        }
        return res;
    }

}

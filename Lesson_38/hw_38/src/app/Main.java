/*
Допустим у нас в программе Programmer, QA Engineer, BackEnd Programmer, FrontEnd Programmer.

Вам необходимо реализовать класс Manger, который должен содержать информацию о команде, которой управляет Manger.
Т.е. у Manager должен быть список (List) членов команды.

Важное ограничение: создавая менеджера мы определяем “специализацию менеджера”
т.е.командой каких специалистов он может руководить:
например, только специалистами тестирования, или только программистами, или только фронт-энд программистами.

Реализуйте метод добавления работника в команду.
Естественно, в команду Programmer не должно быть возможным добавить QAEngineer

Класс Manager должен быть generic, и поле List в нем типа T

Можно сделать родительский класс Employee, и его наследниками Programmer, QAEngineer.
У класса Programmer в свою очередь 2 наследника BackEnd Programmer и FrontEnd Programmer.
Или сделать интерфейс Employee

*/

package app;

public class Main {
    public static void main(String[] args) {
        Manager<BackEndProgrammer> backEndProgrammerList = new Manager<>("Коля", 5500);
        backEndProgrammerList.getEmployeeList().add(new BackEndProgrammer("Женя",2123));
        backEndProgrammerList.getEmployeeList().add(new BackEndProgrammer("Витя",2234));
        backEndProgrammerList.getEmployeeList().add(new BackEndProgrammer("Петя",2345));

        Manager<QAEngineer> qaEngineerList = new Manager<>("Слава", 4300);
        qaEngineerList.getEmployeeList().add(new QAEngineer("Дима",1987));
        qaEngineerList.getEmployeeList().add(new QAEngineer("Саша",1876));
        qaEngineerList.getEmployeeList().add(new QAEngineer("Стас",1765));

        printTeam(backEndProgrammerList);

        printTeam(qaEngineerList);

        //и т.д.
    }

    public static void printTeam(Manager manager){
        System.out.println(manager);
        System.out.println("Его подчиненные:");
        System.out.println(manager.getEmployeeList());
    }
}

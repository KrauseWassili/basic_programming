package app;

import app.exceptions.AllProgrammersUnavailable;
import app.exceptions.ManagerBusyException;
import app.model.Manager;
import app.model.Programmer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Oleg", List.of(
                new Programmer("Nikita"),
                new Programmer("Lena")
        ));

        manager.setBusy(false);

        try {
            manager.work("task1");
        } catch (AllProgrammersUnavailable e){
            System.out.println("Задача не решена т.к. нам не хватает программистов");
            System.out.println("Нанимаем новых");
        } catch (ManagerBusyException e){
            System.out.println("Задача не решена т.к. manager перегружен");
            System.out.println("Нужен еще manager");
        }

    }
}

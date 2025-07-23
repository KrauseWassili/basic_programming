package app.model;

import app.exceptions.AllProgrammersUnavailable;
import app.exceptions.ManagerBusyException;
import app.exceptions.ProgrammerNotAvailableException;

import java.util.List;

public class Manager {
    private String name;
    private List<Programmer> team;
    private boolean isBusy = false;

    public Manager(String name, List<Programmer> team) {
        this.name = name;
        this.team = team;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public void work(String task){
        if (isBusy) throw new ManagerBusyException();

        for (Programmer programmer : team){
            try{
                System.out.println("Поручаем задачу " + programmer.getName());
                programmer.work(task);
                return;
            } catch (ProgrammerNotAvailableException e){
                System.out.println("Программист " + programmer + " не доступен! Ожидание " + e.getUnavailableTime());
                System.out.println("Переходим к следующему");
                System.out.println();
            }
        }
        throw new AllProgrammersUnavailable();
    }

}
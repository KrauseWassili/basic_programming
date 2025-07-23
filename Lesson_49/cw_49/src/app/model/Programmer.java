package app.model;

import app.exceptions.ProgrammerNotAvailableException;

import java.util.Random;

public class Programmer {
    private String name;
    private boolean isAvailable;
    private  int time;

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setRandomStatus(){
        Random random = new Random();
        isAvailable = random.nextBoolean();
        if (!isAvailable){
            time = random.nextInt(100);
        }
    }


    public void work(String task){
        setRandomStatus();
        if (isAvailable){
            System.out.println(name + " сделал " + task);
        } else {
            throw new ProgrammerNotAvailableException(time);
        }
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
package app;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jack",20);
        System.out.println(p1);

        int ageP1 = p1.getAge();
        System.out.println("ageP1");

        p1.setAge(-22);
        System.out.println("ageP1");


        Account account = new Account(0);
     account.balance = -100000000;
    }
}

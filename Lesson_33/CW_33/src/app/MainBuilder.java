package app;

public class MainBuilder {
    public static void main(String[] args) {

        Person p1=new Person.Builder("Jack","Jackson")
                .height(170)
                .age(40)
                .build();

        System.out.println(p1);

        Person p2=new Person.Builder("John","Johnson")
                .height(180)
                .build();
        System.out.println(p2);
    }

}

package app;

import javax.xml.namespace.QName;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        if(age>=0) {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}

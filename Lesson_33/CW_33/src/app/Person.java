package app;

public class Person {
    private String fName;   //обязательные поля
    private String lName;
    private int age;        //необязательные поля
    private int weight;
    private int height;

    private Person(Builder builder){
        this.fName=builder.fName;
        this.lName=builder.lName;
        this.age=builder.age;
        this.weight=builder.weight;
        this.height=builder.height;
    }



    public static class Builder {
        private String fName;   //обязательные поля
        private String lName;
        private int age = 0;        //необязательные поля
        private int weight = 0;
        private int height = 0;


        public Builder(String fName, String lName) { //Конструктор на обязательные поля
            this.fName = fName;
            this.lName = lName;
        }

        public Builder age(int age){ //Заполнятели для полей экземпляра Builder
            this.age=age;
        return this;
        }
        public Builder weight(int weight){
            this.weight=weight;
            return this;
        }
        public Builder height(int height){
            this.height=height;
            return this;
        }

        public Person build(){ // метод, порождающий экземпляр Person на базе заполненного экземпляра Builder
            return new Person(this);
        }


    }
    @Override
    public String toString() {
        return "Builder{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

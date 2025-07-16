package app2;

public class Person {
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private Adress adress;

    public Person(String fName, String lName, String email, String phone, Adress adress) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
    }

    public Person(String fName, String lName, String email, String phone) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
    }

    public void addAdress(String postcode, String city, String street, String house) {
        this.adress = new Adress(postcode, city, street, house);
    }


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Adress getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + fName + " " + lName + " " + email + " " + phone + " " + adress;
    }
}

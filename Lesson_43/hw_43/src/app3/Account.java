package app3;

public class Account {
    private String iban;
    private Person person;

    public Account(String iban, Person person) {
        this.iban = iban;
        this.person = person;
    }

    public String getIban() {
        return iban;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return iban + " " + person;
    }
}

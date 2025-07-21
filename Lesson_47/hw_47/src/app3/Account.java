package app3;

public class Account {
    private String iban;
    private Person owner;
    private Double balance;

    public Account(String iban, Person owner, Double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    public Double getBalance() {
        return balance;
    }


}

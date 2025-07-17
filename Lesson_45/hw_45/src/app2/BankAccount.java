package app2;

import java.util.Objects;

public class BankAccount {
    private Person owner;
    private String IBAN;
    private double balance;

    public BankAccount(Person owner, String IBAN, double balance) {
        this.owner = owner;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return owner + " IBAN: " + IBAN + " Balance: " + balance;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof BankAccount that)) return false;

        return Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(owner);
    }
}

package Task2;

public class BankAccount {
    String iban;
    double balance;
    Person owner;
    MyDate open;

    public BankAccount(String i, double b, Person ow, MyDate op) {

        iban = i;
        balance = b;
        owner = ow;
        open = op;
    }
}

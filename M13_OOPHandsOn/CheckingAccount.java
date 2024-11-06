package M13_OOPHandsOn;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;


    public CheckingAccount() {
        super();
        overdraftLimit = 2500; // assume bank policy is 2.5k default overdraft limit
    }

    public CheckingAccount(String firstName, String lastName, double balance, double overdraftLimit) {
        super(firstName, lastName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // MUTATOR: a method that implements a business logic
    // that changes one or more values in object
    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
    }
}

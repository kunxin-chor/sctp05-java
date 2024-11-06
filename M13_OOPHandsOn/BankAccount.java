package M13_OOPHandsOn;

public class BankAccount {
    // all Java primitives have a default value
    private String firstName;
    private String lastName;
    private double balance; 

    public BankAccount() {
        firstName = "N/A";
        lastName = "N/A";
        balance = 0;
    }

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance  = balance;
    }

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public String getFullname() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

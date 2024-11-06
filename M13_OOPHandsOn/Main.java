package M13_OOPHandsOn;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setFirstName("Jon");
        account.setLastName("Snow");
        account.setBalance(500);
        System.out.println(account.getFirstName() + " " + account.getLastName() + " - " + account.getBalance());
    
        BankAccount account2 = new BankAccount("Ivan", "Terrible", 3000);
        System.out.println(account2.getFirstName() + " " + account2.getLastName() + " - " + account2.getBalance());
    }
}

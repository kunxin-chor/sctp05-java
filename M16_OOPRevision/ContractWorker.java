package M16_OOPRevision;

public class ContractWorker extends Employee {
    private int hoursWorked;

    public ContractWorker(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public ContractWorker(String firstName, String lastName, String jobTitle, double salary, String dateJoined,
            int hoursWorked) {
        super(firstName, lastName, jobTitle, salary, dateJoined);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateTakeHomePay() {
        return hoursWorked * salary * 0.8;
    }
    
}

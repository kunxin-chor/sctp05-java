package M16_OOPRevision;

public class FullTimeEmployee extends Employee {
    private double annualLeave; // number of days

    public FullTimeEmployee() {
        super();
        annualLeave = 14;
    }

    // overloaded constructor
    public FullTimeEmployee(String firstName, 
    String lastName, 
    String jobTitle,
    double salary,
    String dateJoined,
    int annualLeave
    ) {
        super(firstName, lastName, jobTitle, salary, dateJoined);
        this.annualLeave = annualLeave;
    }

    public double getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(double annualLeave) {
        this.annualLeave = annualLeave;
    }

    // overridden method
    // because the same method exists in the parent
    public double calculateTakeHomePay() {
        return salary * 0.8;
    }


    
}

package M16_OOPRevision;

// when a class has at least one abstract method,
// then the entire class must be abstract
public abstract class Employee implements ContactInterface {
    protected String firstName;
    protected String lastName;
    protected String jobTitle;
    protected double salary;
    protected String dateJoined;

    public Employee() {
        salary = 0; // optional
        firstName = ""; // we assign empty string to string member variables
        lastName = "";  // because by default they are null
        dateJoined = "";
    }

    public Employee(String firstName, 
                    String lastName, 
                    String jobTitle,
                    double salary,
                    String dateJoined) {
        // this -> reference to the object being created
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.salary =  salary;
        this.dateJoined = dateJoined;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
  
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    // HR - has business logic

    // abstract means: the current class doesn't have
    // enough data or information to implement it,
    // but ALL its children class should be able to
    public abstract double calculateTakeHomePay();

    public String getFullName() {
        return firstName + " " + lastName;
    }
    
}

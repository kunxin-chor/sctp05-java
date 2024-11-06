package M08_AccessModifiers;

class Employee {

    // public, private, protected = access modifiers

    // public means anything other code can access and modify
    public String name;
    // private access modifer = no other classes can modify
    private String title;
    private double salary;
    private char gender; // m = male, f = female, o = others

    int yearsJoined; // => if not public, private or protected, then it's package access
                     // => public to all the code in the same package

    // getters and setters

    // getter: return a member variable from a class
    public double getSalary() {
        // when in a method, we access  avariable
        // not defined in the method itself
        // or in the parameters, it will refer to
        // the one in the class
        return salary;
    }

    public String getTitle() {
        return title;
    }

    public String getGender() {
        if (gender == 'm') {
            return "Male";
        } else if (gender == 'f') {
            return "Female";
        } else {
            return "Others";
        }
    }

    // setter: allows us to change the values of a member variable
    public void setName(String newName) {
        // change the name member of this object to whatever the newName parameter is
        this.name = newName;
    }

    public void setTitle(String title) {
        if (! title.equals("")) {
            // this is a reference to the current object
            this.title = title;
        }

    }


    public void setGender(char g) {
        if (g == 'm'|| g=='f'||g=='o') {
            gender = g;
        }
    }

    public void setSalary(double salary) {
        // only update the salary if the new incoming salary is positive
        if (salary >= 0) {
            this.salary = salary;
        } 
    }
}

class Department {
    private String name;
    private String description;
    private int lineExtension;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (! this.name.equals("")) {
            this.name = name;
        }
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getLineExtension() {
        return lineExtension;
    }
    public void setLineExtension(int lineExtension) {
        this.lineExtension = lineExtension;
    }

    
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // we don't want salary to be modifed by other classes
        emp.name = "Tan Ah Kow";
        System.out.println("Employee's salary =" + emp.getSalary());
        
    }
}

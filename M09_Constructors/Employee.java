package M09_Constructors;

// there can only one be public class per file
public class Employee {
    private String name;
    private double salary;
    private String title;

    // IF no constructors is given, Java will just create
    // an empty one:
    // Employee() {
    //
    //}
    // If the class has at least one overloaded constructor
    // then you have to add your own default constructor

    // Default constructor
    // Rules for a constructor
    // 0. Is a method
    // 1. Same name as the class
    // 2. Does not have a return type
    // 3. Does not have an explict return
    //  -- All constructors implictly return the same type as its class
   
    // default constructors are for creating objects with default values
    Employee() {
        // When a constructor is ran, the `this` in the constructor
        // refers to the object being "newed"
        // assign default values to the each of the member variable
        this.name = "";
        this.salary = 1;
        this.title = "N/A";

        // all constructors will return the object
        // which is being created
        // implict: return this;
    }


    // Overloaded constructors are  usually meant
    // for creating objects with specific values
    Employee(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    
}

// the package name must match the folder name
package M07_OOP;

// A class is a custom data type, so we can use
// it as if it is a data type in Java. Composition =
// we build our own custom data type from existing data types
// (even other classes)
class Employee {
    // a class can have variables
    // those variables will be accessible
    // by all the methods in the class
    // -> member variables, attributes, fields, properties, fields
    String firstName;
    String lastName;
    double salary;
    int yearsWorked;
}

class Car {
    String brand;
    int year;
}

class Main {
    public static void main(String[] args) {
        // Create a new employee
        // <Class> <variable name> = new <Class>()
        Employee e = new Employee();
        e.firstName = "John";
        e.lastName = "Snow";
        e.salary = 3500;
        e.yearsWorked = 1;

        // <data type> variable_name = <default value>
        // int secretOfLife = 42;
        System.out.println(e.firstName);
        System.out.println(e.lastName);
        System.out.println(e.salary);
        System.out.println(e.yearsWorked);

        // create another "instance" (aka object) of employee
        Employee e2 = new Employee();
        e2.firstName = "Tony";
        e2.lastName = "Stare";
        e2.salary = 50000;
        e2.yearsWorked = 10;
        System.out.println(e2.firstName);
        System.out.println(e2.lastName);
        System.out.println(e2.salary);
        System.out.println(e2.yearsWorked);
     
    }

   
}

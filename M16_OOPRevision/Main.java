package M16_OOPRevision;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee jon = new FullTimeEmployee(
                "Jon", "Snow", "Manager", 3000, "1st Jan 2024", 15);
        System.out.println(jon.calculateTakeHomePay());

        Employee alan = new ContractWorker(
                "Alan", "Lee", "Janitor", 1500, "2nd Jan 2023", 30);
        System.out.println(alan.calculateTakeHomePay());

        // We cannot create a new Employee object
        // because it is abstract
        // Employee alan = new Employee("Alan", "Lee", "Staff", 3000, "1st Jan 2023");
        // alan.calculateTakeHomePay();

        Customer c= new Customer("Tony", "Stare");

        ArrayList<Employee> roster = new ArrayList<>();
        roster.add(alan);
        roster.add(jon);

        // contact list: should contain employees and customers
        ArrayList<ContactInterface> contacts = new ArrayList<>();
        contacts.add(c);
        contacts.add(jon);
        contacts.add(alan);

    }
}

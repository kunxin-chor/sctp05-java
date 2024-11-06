package M09_Constructors;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(); // <= new Employee() -> uses the Employee constructor
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.getTitle());

        Employee e2 = new Employee("Jon Snow", "Ranger of the North", 3000);
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());
        System.out.println(e2.getTitle());

    }
}

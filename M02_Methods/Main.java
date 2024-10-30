package M02_Methods;

public class Main {

    // The main method is the starting point of all Java programs
    public static void main(String[] arg) {
        int sum = addTwo(3, 4);
        System.out.println(sum);

        sayHello("Paul");

        System.out.println(addTwo(3.5, 4.5));
    } 

    // a method to take two integers and return their sum
    // 1. name
    // 2. what are the parameters and their data types
    // 3. what is the process for the method to arrive at the answer
    // 4. return the result of the method
    // 5. set the data type of the return
    public static int addTwo(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // with method overloading we can have methods
    // of the same name. Method Overloading
    // is having > 1 methods with the same name
    // but the order of their parameter's data type
    // and the return data type is different
    public static int addTwo(double x, double y) {
        // cast the result of (x + y) to integer and returns it
        return (int)(x + y);
    }

    // if a method does not return anything, its
    // implictly returning a void
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    // the method signature is:
    // <return type> <name of the method> (<data type of the parameter>)
    // double findAverage(int x, int y, int z) => double findAverage(int, int, int)
    // double findAverage(double x, double y, double z) => double findAverage(double, double, double)
    // double findAverage(int x, double y, double z) => double findAverage(int, double, double)
    // double findAverage(double x, double y, int z) => double findAverage(double, double, int)
    // double findAverage(double x, double y, double z, double a) => double findAverage(double, double, double, double)


     // double fidnAverage(int x,  int y) has the same signature as: double findAverage(int a, int b)
     // the names of the parameter doesn't contribute to the same signautre

  
}

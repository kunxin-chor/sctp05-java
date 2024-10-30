package M03_BMI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a Scanner allows the user to type into the Java program
        /// we have to create a new scanner
        // Scanner sc -> sc will be a variable that can store objects created from the Scanner class
        // new Scanner(System.in) -> create a new Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your weight");
        double weight = sc.nextDouble(); // <-- wait until the user types in something and press enter
        System.out.print("Please enter your height: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.print("Your BMI is " + bmi);

        // find the weight classification based ob BMI
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 35) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesse");
        }
    }
}


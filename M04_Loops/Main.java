package M04_Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.in - your primary input
        Scanner sc = new Scanner(System.in);

        // Loan repayment calculator
        // The user enters a loan amount
        // and the interest rate, as well as the repayment rate
        // and then we tell the user how long to repay the loan
        // for a providen repayment amout per month
        System.out.print("Enter the loan amount");
        double loan = sc.nextDouble();
        System.out.print("Enter the interest ate (0.1 = 10% eg)");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Enter how you much repy per month");
        double repaymentAmt = sc.nextDouble();

        int months = 0;
        // Loop invariant before the loop starts
        // no time has passed so months should be 0

        while (loan > 0) {
            // Loop invariant before the start of each loop
            // There is still loan to be paid

            // calculate and apply the interest rate
            loan = loan +  (annualInterestRate/12 * loan);
            loan -= repaymentAmt; // loan = loan - repaymentAmt
            months++; // => months = months + 1

            // Loop variant at the end of each loop
            // Loan should be increased by the interest rate and
            // reduce by the repayment amount for the nth month
            // where n is the months variable
        }
        // Loop variant after the end of the loop
        // the months variable should be how many months it take repay the month
        System.out.println(months);

        // TODO: we want find the summation of 1 to 10
        // LOOP VARIANT BEFORE THE START OF THE FIRST ROUND OF THE LOOP
        // summation is 0 because we have considered 0 number so far in the seqeunce
        int summation = 0;
        for (int i = 1; i < 11; i++) {
            // LOOP INVARIANT BEFORE THE LOOP STARTS
            // We have not exhausted every number in the sequeence
            // if n is the nth round of the loop, then the sequence at subscript n
            // should be less than 11
        
            summation = summation + i;

            // LOOP INVARIANT BEFORE THE LOOP ENDS
            // summation should be the total of number in sequence up to the
            // nth round of the loop.
        }
        // LOOP INVARIANT: summation variable should store the sum of the sequence (aka 1 to 10)

    }
}

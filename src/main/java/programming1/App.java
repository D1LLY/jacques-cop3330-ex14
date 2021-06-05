/*
“WI,” then the order must be charged 5.5% tax. The program should display the subtotal, tax, and total for Wisconsin residents but display just the total for non-residents.

Example Output
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
Or

What is the order amount? 10
What is the state? MN
The total is $10.00

Constraints
Implement this program using only a simple if statement—don’t use an else clause.
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

package programming1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static DecimalFormat df2 = new DecimalFormat("#.00");

    // final double TAX=.055;
    public static void main(String[] args) {
        double TAX = .055;

        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        int amount = in.nextInt();

        System.out.print("What is the state? ");
        String state = in.next();

        String out = "The total is $" + df2.format(amount);

        if (state.equalsIgnoreCase("wi")) {
            double tax=(amount*TAX);
            double total= amount + tax;
            out = "The subtotal is $" + df2.format(amount) + ".\n" + "The tax is $" +tax+".\n"+ "The total is $"+total+".";


        }
        System.out.println(out);
    }
}
package Base;

import java.util.Scanner;

/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Alek Dussuau


Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the
 items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then
 print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints
Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations
and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

Challenges
Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed
if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are
 no more items to be entered.
 */
public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        //inputs
        double product1 = item_checkout(1);
        double product2 = item_checkout(2);
        double product3 = item_checkout(3);

        //math
        double subtotal = product1 + product2 + product3;
        double tax = subtotal * .055;
        double total = subtotal + tax;

        //outputs
        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",subtotal,tax,total);
    }

    private static double item_checkout(int num){
        //inputs
        System.out.printf("Enter the price of item %d: ",num);
        String s_price = input.nextLine();
        System.out.printf("Enter the quantity of item %d: ",num);
        String s_quantity = input.nextLine();

        //parsing
        double temp_price = Integer.parseInt(s_price);
        int temp_quantity = Integer.parseInt(s_quantity);

        //math
        return temp_price * temp_quantity;
    }
}

package java_basics.day4_Input_and_Ouput.Problems;

// Take two numbers from the user and print their sum, difference, product, quotient, and remainder.

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program demonstrates Arithmetic Operators ");
        System.out.println("Please enter two numbers: ");

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("The sum of the two numbers is: " + (num1 + num2));
        System.out.println("The difference between two numbers is: " + (num1 - num2));
        System.out.println("The product of two number is: " + (num1 * num2));
        System.out.println("the quotient of two numbers is: " + (num1 / num2));
        System.out.println("The remainder of two numbers is: " + (num1 % num2));

        scanner.close();
    }
}

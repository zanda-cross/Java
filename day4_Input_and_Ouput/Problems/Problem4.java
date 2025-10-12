package java_basics.day4_Input_and_Ouput.Problems;

// Take marks in 3 subjects, find average, and display grade (reuse your Day 3 Problem 7 but with user input).

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write marks of 3 Subjects to find the average.");

        System.out.println("Enter the marks of your first Subject: ");
        double sub1 = scanner.nextDouble();

        System.out.println("Enter the marks of your second Subject: ");
        double sub2 = scanner.nextDouble();

        System.out.println("Enter the marks of your third Subject: ");
        double sub3 = scanner.nextDouble();

        double average = (sub1 + sub2 + sub3) / 3;
        System.out.println("your average is: " + (average));
        if (average >= 90) {
            System.out.println("you got grade A");
        } else if (average >= 80) {
            System.out.println("you got grade B");
        } else {
            System.out.println("you got grade C");
        }

        scanner.close();
    }
}

package java_basics.day3_Operators.Practice_Problems;

import java.util.Scanner;

/*
Write a program that:
Takes marks in 3 subjects,
Calculates average,
Displays:
“Grade A” if avg ≥ 90
“Grade B” if avg ≥ 75
Otherwise “Grade C”
*/

public class Problem7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Subject 1 marks : ");
        int a = scanner.nextInt();

        System.out.println("Enter Subject 2 marks : ");
        int b = scanner.nextInt();

        System.out.println("Enter Subject 3 marks : ");
        int c = scanner.nextInt();

        double average = (a + b + c) / 3.0;
        System.out.println("Average : " + average);

        if(average >= 90) {
            System.out.println("You got Grade A");
        } else if (average >= 75) {
            System.out.println("You got Grade B");
        } else {
            System.out.println("You got Grade C");
        }
        scanner.close();
    }
}

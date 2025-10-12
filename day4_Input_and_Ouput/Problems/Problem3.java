package java_basics.day4_Input_and_Ouput.Problems;

/*
 Take the radius of a circle as input and print the area and circumference.
 Formula:
    Area = π × r²
    Circumference = 2 × π × r
 */

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        double pie = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("To find the area and circumference of the circle Please enter the values below: ");
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        System.out.println("To Calculate Area = π × r² = " + (pie * (radius * radius)));

        System.out.println("To calculate Circumference of the circle = 2 × π × r = " + (2 * pie * radius));

        scanner.close();

    }
}

package java_basics.Day4_Input_and_Ouput.Problems;

// Ask the user for their full name, favorite number,
// and whether they like Java (true/false). Then print all answers nicely.

import java.util.Scanner;
public class Problem5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your favourite number: ");
        int num = scanner.nextInt();

        System.out.println("do you like java?");
        boolean java = scanner.nextBoolean();

        System.out.println("Your Name is: " + name);
        System.out.println("Your favourite number is: " + num);
        System.out.println("You like java? " + java);

        scanner.close();
    }
}

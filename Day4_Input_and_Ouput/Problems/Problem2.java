package java_basics.Day4_Input_and_Ouput.Problems;

// Take a name and age from the user and print: “Hello [name], you are [age] years old.”

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        scanner.close();
    }
}

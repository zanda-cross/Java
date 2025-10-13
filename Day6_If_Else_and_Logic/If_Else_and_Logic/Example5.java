package java_basics.Day6_If_Else_and_Logic.If_Else_and_Logic;

// Nested If (Inside Another If)

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Do you have an ID? Please answer in true or false");
        Boolean hasID = sc.nextBoolean();

        if(age >= 20) {
            if (hasID == true) {
                System.out.println("you can enter the club.");
            } else {
                System.out.println("Bring your ID next time!");
            }
        } else {
            System.out.println("you are not old enough.");
    }
    }
}

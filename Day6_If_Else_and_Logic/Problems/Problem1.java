package java_basics.Day6_If_Else_and_Logic.Problems;

// Write a program to find the largest of three numbers using if-else.

public class Problem1 {

    public static void main(String[] args) {

        int one = 10;
        int two = 20;
        int three = 30;

        if (one > two && one > three) {
            System.out.println(one + " is the largest number.");
        } else if (two > one && two > three) {
            System.out.println(two + " is the largest number");
        } else {
            System.out.println(three + " is the largest number");
        }

    }
}

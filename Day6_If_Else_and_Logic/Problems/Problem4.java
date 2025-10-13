package java_basics.Day6_If_Else_and_Logic.Problems;

// Check if a number is divisible by both 3 and 5.

public class Problem4 {

    public static void main(String[] args) {

        int num = 15;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " this number is divisible by both 3 and 5.");
        } else {
            System.out.println("its not divisible");
        }
    }
}

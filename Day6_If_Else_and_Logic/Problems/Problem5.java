package java_basics.Day6_If_Else_and_Logic.Problems;

// Use nested if to check student grade and whether they’ve passed (marks ≥ 40).

public class Problem5 {

    public static void main(String[] args) {

        int marks = 45;

        if (marks >= 40) {
            if (marks >= 80) {
                System.out.println("Grade A");
            } else if (marks >= 70) {
                System.out.println("Grade B");
            } else if (marks >= 60) {
                System.out.println("Grade C");
            } else {
                System.out.println("Grade D");
            }
            System.out.println("Passed");
        } else {
            System.out.println("Did not pass.");
        }
    }
}

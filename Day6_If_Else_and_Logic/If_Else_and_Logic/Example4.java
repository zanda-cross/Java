package java_basics.Day6_If_Else_and_Logic.If_Else_and_Logic;

// Grade Calculator

public class Example4 {

    public static void main(String[] args) {

        int marks = 50;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}

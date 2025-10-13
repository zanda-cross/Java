package java_basics.Day6_If_Else_and_Logic.If_Else_and_Logic;

// Simple Salary Bonus Checker

public class Example8 {

    public static void main(String[] args) {

        int salary = 50000;
        int years = 3;

        if (years > 2) {
             salary += 5000;
        }

        System.out.println("Your salary with bonus is: " + salary);
    }
}

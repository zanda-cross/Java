package java_basics.Day6_If_Else_and_Logic.Problems;

// Check if a year is a leap year.

public class Problem2 {

    public static void main(String[] args) {

        /*
        Rule 1: Divisible by 4. A year is a leap year if it is perfectly divisible by 4, such as 2024.
        Rule 2: Exception for century years. A year that is divisible by 100 is NOT a leap year, such as 1900.
        Rule 3: Exception to the exception. A year that is divisible by 400 IS a leap year, such as 2000.
        ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) (this is the formula for leap year)
         */

        int year = 1900;

        if ((year % 4 == 0 && year % 400 == 0) || (year % 100 != 0))  {
            System.out.println("its a leap year");
        } else {
            System.out.println("its not a leap year");
        }
    }
}

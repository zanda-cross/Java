package java_basics.Day3_Operators.Practice_Problems;

// Demonstrate both ++x and x++ differences with print statements.

public class Problem6 {

    public static void main(String[] args){

        int a = 5;
        System.out.println(a++); // Prints 5, THEN increases a to 6 (post-increment)
        System.out.println(++a); // Increases a which is 6 now to 7 FIRST, THEN prints 7 (pre-increment)
    }
}

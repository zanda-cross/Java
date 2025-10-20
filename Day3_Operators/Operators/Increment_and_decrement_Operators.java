package java_basics.Day3_Operators.Operators;

/*
| Operator | Meaning   | Example        | Result |
| -------- | --------- | -------------- | ------ |
| `++`     | Increment | `x++` or `++x` | +1     |
| `--`     | Decrement | `x--` or `--x` | -1     |
 */

public class Increment_and_decrement_Operators {

    public static void main(String[] args){
            int a = 5;

            System.out.println(a++); // Prints 5, THEN increases a to 6 (post-increment)
            System.out.println(++a); // Increases a which is 6 now to 7 FIRST, THEN prints 7 (pre-increment)
            System.out.println(a--); // Prints 7, THEN decreases a to 6 (post-decrement)
            System.out.println(--a); // Decreases a which is 6 now to 5 FIRST, THEN prints 5 (pre-decrement)
    }
}

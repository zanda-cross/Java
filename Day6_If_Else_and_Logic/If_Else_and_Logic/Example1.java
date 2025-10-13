package java_basics.Day6_If_Else_and_Logic.If_Else_and_Logic;

/*
| Concept     | Description                      | Example                        |
| ----------- | -------------------------------- | ------------------------------ |
| `if`        | Executes when condition is true  | `if (x > 10)`                  |
| `else`      | Executes when condition is false | `else { ... }`                 |
| `else if`   | Used for multiple conditions     | `if (...) else if (...)`       |
| `nested if` | `if` inside another `if`         | `if (...) { if (...) { ... }}` |
| `switch`    | Best for fixed options           | `switch (day) { case 1: ... }` |
 */

// Checking if Number is Positive, Negative or Zero

public class Example1 {

    public static void main(String[] args) {

        int num = 2;

        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("it is zero");
        }

    }
}

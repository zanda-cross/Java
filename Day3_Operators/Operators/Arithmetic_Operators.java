package java_basics.Day3_Operators.Operators;

/*
| Operator | Meaning             | Example  | Result |
| -------- | ------------------- | -------- | ------ |
| `+`      | Addition            | `10 + 5` | 15     |
| `-`      | Subtraction         | `10 - 5` | 5      |
| `*`      | Multiplication      | `10 * 5` | 50     |
| `/`      | Division            | `10 / 3` | 3      |
| `%`      | Modulus (remainder) | `10 % 3` | 1      |
*/

public class Arithmetic_Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println("a + b : " + (a + b)); // Addition
        System.out.println("b - a : " + (b - a)); // Subtraction
        System.out.println("a * b : " + (a * b)); // Multiplication
        System.out.println("a / b : " + (a / b)); // Division
        System.out.println("a % b : " + (a % b)); // Remainder

    }
}

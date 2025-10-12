package java_basics.day3_Operators.Operators;

/*
| Operator | Meaning          | Example  | Result |
| -------- | ---------------- | -------- | ------ |
| `==`     | Equal to         | `5 == 5` | true   |
| `!=`     | Not equal to     | `5 != 3` | true   |
| `>`      | Greater than     | `7 > 3`  | true   |
| `<`      | Less than        | `4 < 2`  | false  |
| `>=`     | Greater or equal | `5 >= 5` | true   |
| `<=`     | Less or equal    | `5 <= 6` | true   |
 */

public class Relational_Operators {

    public static void main(String[] args){
        int a = 4;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}

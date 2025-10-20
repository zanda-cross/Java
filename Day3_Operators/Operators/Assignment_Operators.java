package java_basics.Day3_Operators.Operators;

/*
| Operator | Meaning             | Example  | Equivalent To |
| -------- | ------------------- | -------- | ------------- |
| `=`      | Assign              | `a = 5`  | —             |
| `+=`     | Add and assign      | `a += 3` | `a = a + 3`   |
| `-=`     | Subtract and assign | `a -= 2` | `a = a - 2`   |
| `*=`     | Multiply and assign | `a *= 4` | `a = a * 4`   |
| `/=`     | Divide and assign   | `a /= 2` | `a = a / 2`   |
 */
public class Assignment_Operators {

    public static void main(String[] args){
        int a = 2;

        System.out.println(a = 2); // a is 2
        System.out.println(a += 2); // a is 4
        System.out.println(a -= 3); // a is 1 because 4 - 1
        System.out.println(a *= 4); // a is 4 because 1 * 4
        System.out.println(a /= 8); // a is 4 / 8
    }
}

package java_basics.day3_Operators.Operators;

/*
| Operator | Meaning | Example         | Result |
| -------- | ------- | --------------- | ------ |
| `&&`     | AND     | `true && false` | false  |
| `||`     | OR      | `true || false` | true   |
| `!`      | NOT     | `!true`         | false  |
 */
public class logical_operators {

    public static void main(String[] args){

        int age = 20;
        boolean hasID = true;

        System.out.println(age >= 18 && hasID);
        System.out.println(age >= 18 || hasID);
        System.out.println(!hasID);
        System.out.println();
        System.out.println();
    }
}

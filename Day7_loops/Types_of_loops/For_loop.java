package java_basics.Day7_loops.Types_of_loops;

/*
| Loop Type  | Syntax Focus                     | When to Use                                                 |
| ---------- | -------------------------------- | ----------------------------------------------------------- |
| `for`      | Known number of iterations       | Counting or repeating a fixed number of times               |
| `while`    | Runs *while* a condition is true | When you don’t know how many times to run                   |
| `do-while` | Runs *at least once*             | When code should execute once before checking the condition |
 */

public class For_loop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }
}

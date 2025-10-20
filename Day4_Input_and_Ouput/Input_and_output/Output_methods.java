package java_basics.Day4_Input_and_Ouput.Input_and_output;

/*
| Method                 | Description                                    | Example                              |
| ---------------------- | ---------------------------------------------- | ------------------------------------ |
| `System.out.print()`   | Prints text **without** a new line             | `System.out.print("Hello");`         |
| `System.out.println()` | Prints text **with** a new line                | `System.out.println("Hello");`       |
| `System.out.printf()`  | Prints **formatted** output (like printf in C) | `System.out.printf("Age: %d", age);` |

 */
public class Output_methods {

    public static void main(String[] args){

        int age = 23;

        System.out.print("hello ");
        System.out.println("hellow there");
        System.out.printf("age: %d", age);
    }
}

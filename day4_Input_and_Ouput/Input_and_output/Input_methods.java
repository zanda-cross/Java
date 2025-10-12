package java_basics.day4_Input_and_Ouput.Input_and_output;

import java.util.Scanner;

/*
| Method          | Description                             | Example                            |
| --------------- | --------------------------------------- | ---------------------------------- |
| `nextInt()`     | Reads an integer                        | `int age = sc.nextInt();`          |
| `nextFloat()`   | Reads a float number                    | `float price = sc.nextFloat();`    |
| `nextDouble()`  | Reads a double                          | `double salary = sc.nextDouble();` |
| `next()`        | Reads a single word (no spaces)         | `String name = sc.next();`         |
| `nextLine()`    | Reads an entire line (including spaces) | `String sentence = sc.nextLine();` |
| `nextBoolean()` | Reads true/false                        | `boolean flag = sc.nextBoolean();` |
 */

public class Input_methods {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Enter the value with a point : ");
        float value = scanner.nextFloat();

        System.out.println("Enter the value with a point once again : ");
        double value2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter a word without any spaces : ");
        String name = scanner.nextLine();

        System.out.println("Enter a sentence : ");
        String sentence = scanner.nextLine();

        System.out.println("Enter a true or false value : ");
        boolean value3;
        String booleanMessage = "";
        if (scanner.hasNextBoolean()) {
            value3 = scanner.nextBoolean();
        } else {
            value3 = false;
            booleanMessage = "you did not enter a true or false value, so the default value false is used.";
        }
        System.out.println(age);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(name);
        System.out.println(sentence);
        System.out.println(value3);

        if (!booleanMessage.isEmpty()){
            System.out.println(booleanMessage);
        }

        scanner.close();

    }
}

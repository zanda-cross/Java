package java_basics.day5_Type_Casting.Types_of_Type_Casting;

public class Example {

    public static void main(String[] args) {

        int a = 8;
        double widened = a;  // widening
        System.out.println("Widened (int → double): " + widened);

        double b = 5.76;
        int narrowed = (int) b;  // narrowing
        System.out.println("Narrowed (double → int): " + narrowed);

        int x = 4;
        double y = 2.5;
        double result = x + y;  // int auto-converted to double
        System.out.println("Result of int + double: " + result);

        char ch = 'B';
        int ascii = ch;  // char → int
        System.out.println("ASCII of " + ch + " is: " + ascii);
    }
}

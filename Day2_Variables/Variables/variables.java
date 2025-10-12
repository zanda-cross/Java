package java_basics.Day2_Variables.Variables;

public class variables {

    public static void main(String[] args) {
        int one = 1; // 4 bytes (commonly used for whole numbers)
        boolean isAlive = true; // 1 bit (true or false)
        float two = 2; // 4 bytes (decimal numbers, less precision)
        double three = 3; // 8 bytes (decimal numbers, more precision)
        long four = 4; // 8 bytes (large integers)
        byte five = 5; // 1 byte (range: -128 to 127)
        short six = 6; // 2 bytes
        char seven = 'S'; // 2 bytes (single character, e.g., 'A')

        System.out.println("this is value of int variable : " + one);
        System.out.println("this is value of float variable : " + two);
        System.out.println("this is value of double variable : " + three);
        System.out.println("this is value of long variable : " + four);
        System.out.println("this is value of byte variable : " + five);
        System.out.println("this is value of short variable : " + six);
        System.out.println("this is value of char variable : " + seven);
        System.out.println("this is value of boolean variable : " + isAlive);
    }
}

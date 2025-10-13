package java_basics.Day6_If_Else_and_Logic.If_Else_and_Logic;

// Traffic Light Simulator

public class Example7 {

    public static void main(String[] args) {

        // Use .equals() for comparing strings, not ==.

        String color = "Yellow";

        if (color.equals("Red")) {
            System.out.println("STOP");
        } else if (color.equals("Yellow")) {
            System.out.println("Get Ready");
        } else if (color.equals("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color");
        }

    }
}

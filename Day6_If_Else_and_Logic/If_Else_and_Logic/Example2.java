package java_basics.Day6_If_Else_and_Logic.If_Else_and_Logic;

// Temperature Categorizer

public class Example2 {

    public static void main(String[] args) {

        int temp = 30;

        if (temp >= 40) {
            System.out.println("its a hot day");
        } else if (temp >= 25) {
            System.out.println("It's a pleasant day.");
        } else {
            System.out.println("It's a cold day.");
        }
    }
}

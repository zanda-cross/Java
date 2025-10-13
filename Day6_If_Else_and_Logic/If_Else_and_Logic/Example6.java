package java_basics.Day6_If_Else_and_Logic.If_Else_and_Logic;

// Switch Statement

public class Example6 {

    public static void main(String[] args) {

        int day = 0;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You dont exist.");
                break;
            // Use break to stop the switch once the matching case is found.
        }

    }
}

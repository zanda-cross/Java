package java_basics.Day5_Type_Casting.Types_of_Type_Casting;

/*
Narrowing (Manual)
Converts bigger → smaller type
You must do it manually
Possible data loss
Example: double → int
 */
public class Narrowing {

    public static void main(String[] args) {

        double value = 23.45;
        int num = (int) value;
        System.out.println(num); // so it basically removes the decimal point hence shortening the value
    }
}

package java_basics.day5_Type_Casting.Types_of_Type_Casting;

/*
Widening (Automatic)
Converts smaller → bigger type
No data loss
Done by Java automatically
Example: int → double
 */
public class Widening {

    public static void main(String[] args){
        int num = 10;
        double value = num; // converts int to double Automatically

        System.out.println(value);
    }
}

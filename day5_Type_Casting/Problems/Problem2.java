package java_basics.day5_Type_Casting.Problems;

// Take a double → convert to int → print both (notice what’s lost).

public class Problem2 {

    public static void main(String[] args) {

        double value = 34.35;
        int num = (int)value;

        System.out.println(value);
        System.out.println(num);
    }
}

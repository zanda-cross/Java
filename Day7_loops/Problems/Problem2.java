package java_basics.Day7_loops.Problems;

// Print even numbers between 1 and 20 using a while loop.

public class Problem2 {

    public static void main(String[] args){

        int i = 1;

        while (i <= 20) {
            if (i % 2 == 0) { // to check if number is even
                System.out.println(i);
            }
            i++;
        }
    }
}

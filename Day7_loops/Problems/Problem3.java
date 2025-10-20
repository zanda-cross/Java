package java_basics.Day7_loops.Problems;

// Find the sum of first 10 natural numbers using a loop.

public class Problem3 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

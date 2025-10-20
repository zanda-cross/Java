package java_basics.Day7_loops.Problems;

// Check if a given number is prime using a loop.

public class Problem6 {

    public static void main (String[] args) {

        int num = 23;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime == true) {
            System.out.println("its a prime.");
        } else {
            System.out.println("its not a prime.");
        }
    }
}
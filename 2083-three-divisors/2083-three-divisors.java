public class Solution {

    public static boolean isThree(int n) {
        // Calculate the square root of n
        int sqrt = (int) Math.sqrt(n);
        
        // Check if n is a perfect square
        if (sqrt * sqrt != n) {
            return false;
        }
        
        // Check if sqrt is a prime number
        return isPrime(sqrt);
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(isThree(2));  // Output: false
        System.out.println(isThree(4));  // Output: true
    }
}

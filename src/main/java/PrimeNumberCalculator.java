public class PrimeNumberCalculator {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }

    // Main method to test prime number calculation
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

package mypackg4;

public class Prime_Number {

	
	
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void findPrimes(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
	
	public static void main(String[] args) {
        int n = 100; // Change this to find prime numbers up to a different limit
        System.out.println("Prime numbers up to " + n + ":");
        findPrimes(n);
    }
}

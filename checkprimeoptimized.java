public class checkprimeoptimized {
    /* Writing to check prime in optimised version */

    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    // To print primes in range.
    public static void primesinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                ;// true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(isprime(577));
        primesinrange(5000);

    }
}

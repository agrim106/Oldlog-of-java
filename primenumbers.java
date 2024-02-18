import java.util.*;

public class primenumbers {
    public static void main(String[] args) {
        /* Check if a number is prime or not */
        Scanner sd = new Scanner(System.in);
        /*
         * WE will be checking if a number is prime or not so the basic logic for this
         * is that prime numbers are only divisible by 1 and themselves.
         */
        int n = sd.nextInt();
        boolean isprime = true;
        if (n == 2) {
            System.out.println("yes it is prime");
        } else
            for (int i = 2; i <= (n - 1); i++) {
                if (n % i == 0) // This condition tells that N is a multiple of I so if it is true then we can
                                // consider the above written booolean to be false{
                    System.out.println("N is  prime");
                isprime = false;
            }
        if (isprime == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sd.close();

    }
}

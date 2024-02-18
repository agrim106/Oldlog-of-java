public class printreverse {
    public static void main(String[] args) {
        /*
         * To reverse a number in Java, you can follow the steps below:
         * 
         * First, you need to find the remainder of the given number by using the modulo
         * (%) operator.
         * Then, you need to multiply the variable reverse by 10 and add the remainder
         * into it.
         * Divide the number by 10.
         * Repeat the above steps until the number becomes 0.
         */
        // we will use a while loop.
        int n = 23434;
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.print("the reverse of a number is: ");
    }

}

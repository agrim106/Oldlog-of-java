public class reversethegivenumber {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            rev = (rev * 10) + lastdigit;
            /*
             * One thhing to note that this formular is important as to that rev * 10 is in
             * the statement I added n in the statement
             */

        }
        System.out.println("Your reverse of the number is  " + rev);
    }

}

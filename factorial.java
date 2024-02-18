public class factorial {

    public static int facctorial(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        /* calculate the factorial of a number n */
        System.out.println(facctorial(9));

    }

}

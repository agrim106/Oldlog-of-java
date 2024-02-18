import java.util.*;

public class imputandprintreverse {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        int rev = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println("The reverse of the input in the system is " + rev);
        sd.close();
    }

}

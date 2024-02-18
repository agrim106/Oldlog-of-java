import java.util.*;

public class loopshmwrk {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int number;
        int oddsum = 0;
        int evensum = 0;

        System.out.println("enter your number");
        number = sd.nextInt();
        number = sd.nextInt();
        if (number % 2 == 0) {
            evensum = number + number;
            System.out.println("the sum is " + evensum);
        } else {
            oddsum += number;
            System.out.println("the sum is " + oddsum);
        }

        sd.close();
    }

}
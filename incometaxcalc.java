import java.util.*;

public class incometaxcalc {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int income = sd.nextInt();
        /*
         * You commonly forget this line remmember the logic behind this line and
         * whenever taking input from the user always assume the import java.util.* must
         * be written at the top.
         */
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
            /* We added the (int) because of type casting */
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println(" your taxable amount from your salary is : " + tax);
        // Dont forget to close the scanner class so as to stop resource leak
        sd.close();
    }
}
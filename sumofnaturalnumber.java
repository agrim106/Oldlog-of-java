
/*
 * In this question I have to print a sum of n natural numbers, but the thing is
 * we have to take input from the user, this is going to be difficult
 */
import java.util.*;

public class sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        int sum = 0;
        /*
         * WE dont use counter in these tyoes of problems we use 'i' for these so dont
         * get confused, also always double check the logic applying in the while
         * conditions
         */
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
            /*
             * Note : DONT WRITE THE PRINT STATEMENT IN THE WHILE CONDITION BRACKET OR ELSE
             * IT WILL GET PRINTED AS THE SAME AMOUNT OF TIMES.
             */
        }
        System.out.println("the sum of your entered input value is  " + sum);

        sd.close();
    }
}
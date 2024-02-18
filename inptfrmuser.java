import java.util.*;

public class inptfrmuser {
    public static void main(String args[]) {
        /*
         * In this code we will calculate the sum of two variables using the scanner
         * method we just learned previously
         */
        Scanner sd = new Scanner(System.in);
        int a = sd.nextInt();
        int b = sd.nextInt();
        int product = a * b;
        System.out.println(product);
        // int sum = a + b;
        // System.out.println(sum);
        /*
         * always remember to write out the import java line of code wehnenver we will
         * use the scanner command , basically the import line dictates the scanner
         * command to take user from the inpuit
         */
        // Also i am doing another program similar to this in sheet of code too, so I
        // have deliberately commented out the sum statements and have replaced them
        // with the product statements.
        sd.close();
    }

}

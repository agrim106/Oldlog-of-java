import java.util.*;

public class inputfromuser {
    public static void main(String args[]) {
        Scanner sd = new Scanner(System.in);
        // String input = sd.nextLine();
        // System.out.println(input);
        int number = sd.nextInt();
        System.out.println(number);

        float rate = sd.nextFloat();
        System.out.println(rate);
        /*
         * The things written at the top may seem confusiong at the moment but we will
         * learn thoroughy about this later on in the couserses we have planned just
         * rememeber that theres a lot for plan
         */
        sd.close();
    }
}
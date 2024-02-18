public class unaryoperators {
    public static void main(String args[]) {
        /*
         * There are two types of increments in unary ops pre increment and post
         * increments, you'll understand when youll see them.
         */
        int A = 394;
        int B = A++;
        System.out.println(B);
        System.out.println(A);
        /*
         * This was the example of increment in this code the value of the variable
         * changes first and then the output is printed
         * We are gonna do another one but this time we will do decrement. You will the
         * difference in the output of the code.
         */

        int f = 213;
        int w = --f;
        System.out.println(f);
        System.out.println(w);
    }

}

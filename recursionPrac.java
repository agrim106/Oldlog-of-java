import java.util.*;

public class recursionPrac {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        /*
         * Write the recursive function to calculate the sum of first n natural numbers
         */
        int n = sd.nextInt();
        /*
         * public class AddNumbers {
         * 
         * public static void main(String[] args) {
         * int number = 20;
         * int sum = addNumbers(number);
         * System.out.println("Sum = " + sum);
         * }
         * 
         * public static int addNumbers(int num) {
         * if (num != 0)
         * return num + addNumbers(num - 1);
         * else
         * return num;
         * }
         * }
         */
        if (n > 0) {
            int sum = n * n;
            System.out.println("The recursion of the number is " + sum);
        }
        sd.close();
    }

}

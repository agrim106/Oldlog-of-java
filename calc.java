import java.util.*;

public class calc {
    public static void main(String[] args) {
        // Switch statements is used in making calculator.
        /*
         * Since we are building a claculator we need input so we have to use the
         * library tool and scanner class of java.
         */
        Scanner sd = new Scanner(System.in);
        int A = sd.nextInt();
        int B = sd.nextInt();
        char operator = sd.next().charAt(0);
        /*
         * this charAt(0) will thoroughly be explained in the strings chapter just for
         * now know that with only the sd.next the code wont run and this function helps
         * the calculator to process the numbers,WE added this so that we can take a a
         * single character as operator.
         */
        switch (operator) {
            /*
             * You forget to write the char name in the switch parenthesis never forget that
             * the code will not work then
             */
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '/':
                System.out.println(A / B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '%':
                System.out.println(A % B);
                break;
            default:
                System.out.println("add an operator to perform a task");
        }
        sd.close();
    }

}

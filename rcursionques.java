public class rcursionques {
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void main(String[] args) {
        /* Print the numbers from 5 to 1 using recursion */
        int n = 5;
        printNum(n);

    }
}
public class recursionques {
    /* print numbers from 1 to 5 */
    public static void printNum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    /* print numbers from 1 to 5 */
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }

}

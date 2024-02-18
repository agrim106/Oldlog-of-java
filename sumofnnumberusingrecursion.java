public class sumofnnumberusingrecursion {
    public static void printSum(int n, int i, int sum) {
        if (i == n) {

            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);

    }

}

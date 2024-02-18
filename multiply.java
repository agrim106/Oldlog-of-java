public class multiply {
    public static int product(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 66;
        int sol = product(a, b);
        System.out.println("the product of your two integers is : " + sol);
        sol = product(10, 90);
        System.out.println("The solution is :" + sol);
    }
}

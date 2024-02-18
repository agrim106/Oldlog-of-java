public class methods {
    /* This is methods */
    /*
     * public static int sum(int a, int b) {
     * int sum = a + b;
     * return sum;
     * }
     * 
     * public static int add(int a, int b, int c) {
     * int add = a + b + c;
     * return add;
     * }
     */
    public static int sum(int a, int b) {
        int sum = a * b;
        return sum;
    }

    public static float add(float a, float b) {

        float add = a / b;
        return add;
    }

    public static void main(String[] args) {
        System.out.println(sum(90, 023));
        System.out.println(add(90f, 023f));
    }

}
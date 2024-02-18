public class invertedstarpattern {
    public static void main(String[] args) {
        int n = 4;// This is a very important detail to note about inverted loops, we have to
                  // define an integer so we can apply the formula
        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= n - line + 1; j++) {
                /*
                 * In inverted loops we use the formula [n-i+1] the n dictates the amount of
                 * lines in the pattern to make a pattern.
                 */
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("your inverted star pattern is printed");
    }
}

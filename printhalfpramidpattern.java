public class printhalfpramidpattern {
    public static void main(String[] args) {
        int n = 10;
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

public class continueloop {
    public static void main(String[] args) {
        /*
         * This is continue keyword we use this to skip a certain element in loops, we
         * use for loop to use the continue keyword
         */
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }

}

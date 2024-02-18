public class breakstatementloops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            if (i == 4) {
                break;
                /*
                 * This code got an error beacuse i wrote the if statement out side of the for
                 * loop statement remind yourself everytime when writing for loops
                 */

            }
        }
        System.out.println("this loop ended at 4 because of the if statement");
    }

}

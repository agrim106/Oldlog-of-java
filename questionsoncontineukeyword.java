import java.util.*;

public class questionsoncontineukeyword {
    /* Display all the numbers entered by user except multiples of 10 */
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int i = sd.nextInt();
        for (i = 1; i <= 999; i++) {

            if (i % 10 == 0) {
                continue;
            }
            System.out.println();
            sd.close();
        }

    }

    /*
     * I have written the right answer the soution to this showin in the tutorial
     * video was to use a do while loop but that would become an infinite loop which
     * is really inefficient
     * Hooray!!! we did it right
     */
}

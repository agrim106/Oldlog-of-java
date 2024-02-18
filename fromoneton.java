import java.util.*;

public class fromoneton {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int range = sd.nextInt();
        int counter = 1;
        /*
         * Remmeber to add the range integer before the counter and the increment after
         * the print statement.
         */
        while (counter <= range) {
            System.out.println(counter + " ");
            counter++;

        }
        System.out.println("Your desired value has been printed");
        sd.close();
    }
}

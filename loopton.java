import java.util.*;

public class loopton {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int N = sd.nextInt();
        int counter = 1;

        while (counter <= N) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println("Loop from input");
        sd.close();
    }
}

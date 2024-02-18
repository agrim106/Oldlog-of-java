import java.util.*;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int number = sd.nextInt();
        if (number >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("Negative");
        }
        sd.close();
    }
}

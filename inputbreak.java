import java.util.*;

public class inputbreak {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        do {
            System.out.println("enter your number: ");
            int n = sd.nextInt();

            if (n % 10 == 0) {
                break;

            }
            System.out.println(n);

        } while (true);
        sd.close();
    }

}

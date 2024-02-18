import java.util.*;

public class avgcalchmwrk {
    public static void main(String args[]) {
        Scanner sd = new Scanner(System.in);
        double a = sd.nextDouble();
        double b = sd.nextDouble();
        double c = sd.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println(average);
        sd.close();

    }

}

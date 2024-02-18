import java.util.*;

public class syntaxwithparameters {
    public static void printagrim() {
        System.out.println("Agrim is learning functions");
        System.out.println("Agrim is learning functions");
        System.out.println("Agrim is learning functions");
    }

    public static int Sum(int num1, int num2) {
        int Sum = (num1 + num2);
        return Sum;

    }

    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int a = sd.nextInt();
        int b = sd.nextInt();
        int sum = Sum(a, b);
        System.out.println("the sum is:  " + sum);
        sd.close();
    }

}

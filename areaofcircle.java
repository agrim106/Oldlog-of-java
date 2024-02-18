import java.util.*;

public class areaofcircle {
    public static void main(String args[]) {
        Scanner sd = new Scanner(System.in);
        float rad = sd.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        sd.close();
    }

}
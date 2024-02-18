import java.util.*;

public class Arrays1 {
    /* Trying out arrays for the first time */
    public static void main(String[] args) {

        int marks[] = new int[500];
        Scanner sd = new Scanner(System.in);
        // int phy = sd.nextInt();
        // int his= sd.nextInt();
        // int math = sd.nextInt();
        System.out.println(marks.length);
        marks[0] = sd.nextInt();
        marks[1] = sd.nextInt();
        marks[2] = sd.nextInt();
        System.out.println("Marks of Physics: " + marks[0]);
        System.out.println("Marks of History: " + marks[1]);
        System.out.println("Marks of Math : " + marks[2]);
        int percentage = ((marks[0] + marks[1] + marks[2]) / 3);
        System.out.println("Your total percentage is : " + percentage);
        sd.close();
    }
}

import java.util.*;

public class leapyearHW {
    public static void main(String[] args) {
        /*
         * Write a Java program that takes a year from the user and print whether that
         * year is a leap year or not
         */
        Scanner sd = new Scanner(System.in);
        int year = sd.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
        sd.close();
    }

}

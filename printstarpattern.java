public class printstarpattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 90; line++) {
            for (int j = 1; j <= line; j++) {
                /*
                 * Also in this line remember to write in the second loop the print statement
                 * and dont use the ln in this as we need patterns in the same line.
                 */
                System.out.print("*");
            }
            System.out.println();// this was the mistake i made in my code, I didnt include the prit statement in
                                 // the for loop
        }
        System.out.println("your star pattern is printed");
    }
}
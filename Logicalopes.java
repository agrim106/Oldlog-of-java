public class Logicalopes {
    public static void main(String[] args) {
        /*
         * Logical operators are complex first we'll be trying out the logical AND it
         * containns two ampersands
         */
        System.out.println((1 < 4) && (3 > 2));
        /*
         * The logical AND only prints statements if both of them are true even if one
         * of the statements are false it will print output as false
         */
        /*
         * Coming on now to the logical OR it will print True even if one of the
         * statements has a true outcome.
         */
        System.out.println((2 > 23) || (3 < 2389));
        /*
         * the logical NOT converts false values to true and true values to false.
         */
        System.out.println(!(234 > 10000));
    }

}

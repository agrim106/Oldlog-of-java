public class largestofthree {
    public static void main(String[] args) {
        int A = 78;
        int B = 2323;
        int C = 11;

        if ((A > B) && (A > C)) {
            System.out.println("A is larger than B and C");
        } else if (B > C) {
            System.out.println("B is larger than C and A");
        } else {
            System.out.println("C is the largest of all three");
        }
    }

}

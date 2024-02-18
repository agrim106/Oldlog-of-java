public class binarytodec {
    public static void bindec(int binNum) {
        int myNum = binNum;
        int power = 0;
        int decnum = 0;
        while (binNum > 0) {
            int Lastdigit = binNum % 10;
            decnum = decnum + (Lastdigit * (int) Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        System.out.println(" The binary version of the number  " + myNum + " is " + decnum);
    }

    /*
     * this was the code to convert binary number to decimal and now we will do the
     * reverse
     */
    public static void decbin(int n) {
        int myNum = n;
        int pow = 0;
        int binnum = 0;
        while (n > 0) {
            int rem = n % 2;
            binnum = binnum + (rem * (int) (Math.pow(10, pow)));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of the " + myNum + " is " + binnum);
    }

    public static void main(String[] args) {
        bindec(101);
        decbin(56);
    }
}

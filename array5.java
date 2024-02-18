public class array5 {
    public static int binarys(int aditya[], int asiannigga) {
        int start = 0;
        int end = aditya.length - 1;
        while (start <= end) {
            int rizz = (start + end) / 2;
            if (aditya[rizz] == asiannigga) {
                return rizz;
            }
            if (aditya[rizz] < asiannigga) {
                start = rizz + 1;
            } else {
                end = rizz - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int aditya[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 69, };
        int asianigga = 69;
        System.out.println("the number is at the index: " + binarys(aditya, asianigga));
    }
}
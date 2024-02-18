public class array7 {
    /* This code will teach us to write arrays in pairs */
    public static void pairs(int numbers[]) {
        // lets also count the total number of pairs too.
        int tp = 0;
        /* writing out a function for pairs */
        // It will require a nested loop
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            // This is will remain numbers[i] not numbers.length i was about to commit a
            // massive mistake.
            // This line is for the current number selection and making it into a pair, now
            // we will add another loop in it so to pair the arrays continously.
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
        }
        System.out.println("the total number of pairs are: " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };
        pairs(numbers);
    }
}
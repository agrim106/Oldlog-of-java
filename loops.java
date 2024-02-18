public class loops {
    public static void main(String[] args) {
        /* We are learning about while loops today */
        int counter = 0;

        while (counter < 90) {
            System.out.println("This a while loop in java");
            counter++;
            /*
             * We added the counter++ statement so as to stop the loop at 90 without the
             * counter increment statement the loop will run continously as it wont
             * understand when to stop or has it reached 90 or not, the increment increases
             * the value every time the code runs and thus it results in counting the code
             * till it reaches the entered limit
             */
        }
        System.out.println("The loop stops at 90");
    }

}

public class forloop {
    public static void main(String[] args) {
        /*
         * A for loop is a way to repeat a block of code multiple times. It’s like a
         * machine that makes the same thing over and over again.
         * 
         * Here’s how it works:
         * 
         * You tell the machine how many times you want it to repeat the code.
         * You give the machine some instructions on what to do each time it repeats the
         * code.
         * The machine repeats the code as many times as you told it to.
         * For example, let’s say you want to count from 1 to 10. You can use a for loop
         * to do that. Here’s what the code would look like:
         * 
         * for (int i = 1; i <= 10; i++) {
         * System.out.println(i);
         * }
         * 
         * The first line tells the machine to start counting at 1 (int i = 1). The
         * second line tells the machine to keep counting as long as it hasn’t reached
         * 11 (i <= 10). The third line tells the machine what to do each time it counts
         * (i++ means add 1 to i each time). Finally, the fourth line tells the machine
         * to print out the number it just counted.
         */
        // In laymans terms the for loop works as
        // for(intialisation;condition;updation)
        for (int i = 10; i <= 100; i++) {
            System.out.println("The counting is going to start " + i);
        }
    }

}

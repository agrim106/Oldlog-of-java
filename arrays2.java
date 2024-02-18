public class arrays2 {
    // We will create a function first in this arrays code
    public static void update(int marks[]) {
        // Always remeber that [] these are the ones that make an array.
        // Now comes the for loop the most important part of the array.
        for (int i = 0; i < marks.length; i++) {
            // Now come the part where you wanna define what is it that you wanna do to the
            // array.
            marks[i] = marks[i] * 2;
        }

    }

    public static void main(String[] args) {
        int marks[] = { 123, 345, 63, 23 };
        // Thiswas the step you forget you need to remeber to inpit the marks
        // Now we will reminf the main class the function.
        update(marks);
        // Now comes the for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
public class arrays3 {
    public static int linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 4, 6, 7, 73, 23 };
        int key = 4;
        int index = linearsearch(number, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("found the number At : " + index);
        }

    }
}
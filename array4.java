// public class array4 {
//     /* writing the smallest and the largest values in an array. */
//     public static int getlargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 12, 13, 15, 17, 12324 };
//         System.out.println("The largest number in the array is : " + getlargest(numbers));
//     }
// }
public class array4 {
    /* Binary search code */
    public static int binarysearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {/* Remeber to write the name of the array, in the if loop */
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                // If the mid is smaller then key then we write the start+1.
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 6;

        System.out.println("the number is at the index number: " + binarysearch(numbers, key));
    }
}
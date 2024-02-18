import java.util.*;

public class ST2nodelinkedlist {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.print(0);
            return ; // Exit the program if n is 0

        }

        int[] derarr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        List<Integer> rotatedList = new ArrayList<>();

        // Use subList to rotate the array
        rotatedList.addAll(list.subList(n - k, n));
        rotatedList.addAll(list.subList(0, n - k));

        for (int num : rotatedList) {
            System.out.print(num + " ");
        }
        sc.close();

    }
}
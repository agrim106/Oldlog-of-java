public class strings1 {
    /* Check wether a question is palindrome or not */
    // we will first create a function
    public static boolean ispalindrome(String str) {
        // we will now run a for loop
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(ispalindrome(str));
    }
}
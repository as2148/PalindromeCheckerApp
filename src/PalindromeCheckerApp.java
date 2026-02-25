public class PalindromeCheckerApp {

    static boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "level";

        long startTime = System.nanoTime();
        boolean result = checkPalindrome(text);
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}
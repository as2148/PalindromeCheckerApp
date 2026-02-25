class PalindromeChecker {
    boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "racecar";
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(text);
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
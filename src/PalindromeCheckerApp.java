public class PalindromeCheckerApp {

    static boolean check(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return check(text, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String text = "madam";
        boolean result = check(text, 0, text.length() - 1);
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
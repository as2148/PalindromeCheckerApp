public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "A man a plan a canal Panama";
        String normalized = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        boolean result = normalized.equals(reversed);
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
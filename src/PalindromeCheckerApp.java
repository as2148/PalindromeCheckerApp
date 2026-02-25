public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "madam";
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        boolean result = text.equals(reversed);
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
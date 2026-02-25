import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "noon";
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            stack.push(c);
        }
        boolean result = true;
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) {
                result = false;
                break;
            }
        }
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
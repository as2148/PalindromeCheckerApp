import java.util.*;

interface PalindromeStrategy {
    boolean check(String text);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray())
            if (c != stack.pop()) return false;
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "level";
        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(text);
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        boolean result = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                result = false;
                break;
            }
        }
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
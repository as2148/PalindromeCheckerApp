import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "refer";
        Deque<Character> deque = new LinkedList<>();
        for (char c : text.toCharArray()) {
            deque.add(c);
        }
        boolean result = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                result = false;
                break;
            }
        }
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
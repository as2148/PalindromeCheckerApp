public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;
        Node(char data) { this.data = data; }
    }

    public static void main(String[] args) {
        String text = "level";
        Node head = null, tail = null;
        for (char c : text.toCharArray()) {
            Node node = new Node(c);
            if (head == null) head = tail = node;
            else { tail.next = node; tail = node; }
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        Node first = head, second = prev;
        boolean result = true;
        while (second != null) {
            if (first.data != second.data) {
                result = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
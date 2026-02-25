public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "radar";
        char[] arr = text.toCharArray();
        boolean result = true;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                result = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class Palindrome_performancecomparison {

    // Two Pointer Method
    public static boolean twoPointerCheck(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack Method
    public static boolean stackCheck(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Method
    public static boolean dequeCheck(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Two Pointer timing
        long startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long endTime = System.nanoTime();
        long time1 = endTime - startTime;

        // Stack timing
        startTime = System.nanoTime();
        boolean result2 = stackCheck(word);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        // Deque timing
        startTime = System.nanoTime();
        boolean result3 = dequeCheck(word);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        System.out.println("Palindrome Check Results:\n");

        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Method Result: " + result3 + " | Time: " + time3 + " ns");
    }
}
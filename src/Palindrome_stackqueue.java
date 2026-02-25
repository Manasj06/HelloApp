import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Palindrome_stackqueue{

    public static void main(String[] args) {

        String word = "HELLO";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to Queue and Stack
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        System.out.println("Original String: " + word);

        System.out.print("Queue Output (FIFO): ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

        System.out.println();

        System.out.print("Stack Output (LIFO): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
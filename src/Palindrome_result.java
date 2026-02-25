public class Palindrome_result {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        boolean isPalindrome = true;

        int start = 0;
        int end = word.length() - 1;

        // Check if palindrome
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
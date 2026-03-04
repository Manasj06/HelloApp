public class Palindromeresult {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        //PalindromeStrategy strategy = new DequeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.check(word);

        if (result) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
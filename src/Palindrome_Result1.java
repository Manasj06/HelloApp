public class Palindrome_Result1{

    public static void main(String[] args) {

        String word = "madam";

        // Create object of PalindromeChecker
        Palindrome_checker checker = new Palindrome_checker();

        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
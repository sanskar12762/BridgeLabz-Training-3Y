import java.util.Scanner;

public class PalindromeChecker {

    public static String inputString(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static boolean isPalindrome(String text) {
        int start = 0, end = text.length()-1;
        while(start < end)
            if(text.charAt(start++) != text.charAt(end--)) return false;
        return true;
    }

    public static void displayResult(String text, boolean result) {
        System.out.println("'" + text + "' is " + (result ? "a palindrome" : "not a palindrome"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = inputString(sc);
        boolean result = isPalindrome(text);
        displayResult(text, result);
    }
}

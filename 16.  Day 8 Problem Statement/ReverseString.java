
import java.util.Scanner;

public class ReverseString {

    public static String reverse(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() -1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        String input = sc.nextLine();
        System.out.println("Reversed string: " + reverse(input));
    }
}

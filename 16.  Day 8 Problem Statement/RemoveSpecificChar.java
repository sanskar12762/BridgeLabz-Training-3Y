
import java.util.Scanner;

public class RemoveSpecificChar {

    public static String removeChar(String text, char ch) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) != ch) {
                sb.append(text.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("Modified string: " + removeChar(s, ch));
    }
}

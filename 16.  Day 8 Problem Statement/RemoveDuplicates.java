
import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String text) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            if(result.indexOf(String.valueOf(c)) == -1)
                result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("String after removing duplicates: " + removeDuplicates(s));
    }
}

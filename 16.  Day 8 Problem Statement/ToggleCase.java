
import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String text) {
        StringBuilder toggled = new StringBuilder();
        for(int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            if(Character.isUpperCase(c))
                toggled.append(Character.toLowerCase(c));
            else if(Character.isLowerCase(c))
                toggled.append(Character.toUpperCase(c));
            else
                toggled.append(c);
        }
        return toggled.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        System.out.println("Toggled case string: " + toggleCase(text));
    }
}

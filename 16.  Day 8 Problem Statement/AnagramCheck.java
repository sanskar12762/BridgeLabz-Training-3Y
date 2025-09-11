
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static boolean areAnagrams(String s1, String s2) {
        char[] c1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] c2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if(areAnagrams(s1, s2))
            System.out.println("The two strings are anagrams.");
        else
            System.out.println("The two strings are not anagrams.");
    }
}

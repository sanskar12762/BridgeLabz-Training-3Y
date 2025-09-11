
import java.util.Scanner;

public class LexicographicalCompare {

    public static int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int lim = Math.min(len1, len2);
        for (int i = 0; i < lim; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return len1 - len2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int result = compare(s1, s2);
        if(result < 0)
            System.out.println(""" + s1 + "" comes before "" + s2 + "" in lexicographical order");
        else if(result > 0)
            System.out.println(""" + s2 + "" comes before "" + s1 + "" in lexicographical order");
        else
            System.out.println("Both strings are equal");
    }
}

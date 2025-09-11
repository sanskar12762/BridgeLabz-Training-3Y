
import java.util.Scanner;

public class CountSubstringOccurrences {

    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int fromIndex = 0;
        while ((fromIndex = mainStr.indexOf(subStr, fromIndex)) != -1) {
            count++;
            fromIndex += subStr.length();
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter substring to find: ");
        String subStr = sc.nextLine();
        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }
}

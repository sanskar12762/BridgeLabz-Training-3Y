
import java.util.Scanner;

public class MostFrequentChar {

    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256];
        for(int i=0; i<text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int maxFreq = 0;
        char maxChar = 0;
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char)i;
            }
        }
        return maxChar;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Most frequent character: '" + findMostFrequentChar(s) + "'");
    }
}

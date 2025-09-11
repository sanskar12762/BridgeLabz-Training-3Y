
import java.util.Scanner;

public class ReplaceWordInSentence {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s");
        StringBuilder replacedSentence = new StringBuilder();
        for(String w : words) {
            if(w.equals(oldWord)) replacedSentence.append(newWord);
            else replacedSentence.append(w);
            replacedSentence.append(" ");
        }
        return replacedSentence.toString().trim();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter the replacement word: ");
        String newWord = sc.next();
        System.out.println("Modified sentence: " + replaceWord(sentence, oldWord, newWord));
    }
}

import java.util.Scanner;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    public static String getUserFeedback(Scanner sc, int guess) {
        System.out.println("Computer guesses: " + guess);
        System.out.print("Is the guess (high/low/correct)? ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;
        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(sc, guess);
            if (feedback.equals("correct")) {
                System.out.println("Computer guessed your number!");
                found = true;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }
}

// Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
import java.util.Scanner;
public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;
        while(counter >= 1) {
            if(number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest Factor is " + greatestFactor);
        input.close();
    }
}

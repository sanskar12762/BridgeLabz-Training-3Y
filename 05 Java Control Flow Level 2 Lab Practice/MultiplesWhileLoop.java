// Rewrite the program to find all the multiples of a number below 100 using while loop.
import java.util.Scanner;
public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 100;
        while(counter >= 1) {
            if(counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
        input.close();
    }
}

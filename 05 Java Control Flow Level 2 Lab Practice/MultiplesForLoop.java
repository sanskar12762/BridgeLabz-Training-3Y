// Create a program to find all the multiples of a number taken as user input below 100.
import java.util.Scanner;
public class MultiplesForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 100; i >= 1; i--) {
            if(i % number == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}

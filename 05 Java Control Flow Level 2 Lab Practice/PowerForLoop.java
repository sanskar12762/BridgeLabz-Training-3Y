// Create a program to find the power of a number.
import java.util.Scanner;
public class PowerForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;
        for(int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(result);
        input.close();
    }
}

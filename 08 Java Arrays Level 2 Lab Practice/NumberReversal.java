
import java.util.Scanner;
public class NumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        int count = 0;
        int tempNumber = number;
        while(tempNumber > 0) {
            count++;
            tempNumber /= 10;
        }
        int[] digits = new int[count];
        tempNumber = number;
        for(int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }
        int[] reversed = new int[count];
        for(int i = 0; i < count; i++) {
            reversed[i] = digits[count - i -1];
        }
        System.out.print("Number in reverse: ");
        for(int digit : reversed) {
            System.out.print(digit);
        }
        System.out.println();
        sc.close();
    }
}

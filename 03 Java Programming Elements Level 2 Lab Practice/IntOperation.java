// Write an IntOperation program by taking a, b, and c as input values and print the integer operations a + b * c, a * b + c, c + a / b, and a % b + c.
import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        input.close();
    }
}

import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a);
        for(int i=1; i<n; i++) {
            System.out.print(" " + b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        printFibonacci(n);
    }
}

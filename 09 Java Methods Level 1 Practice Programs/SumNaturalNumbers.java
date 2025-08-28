
import java.util.Scanner;
public class SumNaturalNumbers {
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumNaturalNumbers(n);
        System.out.println("Sum of natural numbers up to " + n + " is " + sum);
        sc.close();
    }
}

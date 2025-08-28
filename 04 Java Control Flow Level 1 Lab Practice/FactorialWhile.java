import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Not a natural number");
        } else {
            int factorial = 1;
            int i = 1;
            while(i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial is " + factorial);
        }
        sc.close();
    }
}
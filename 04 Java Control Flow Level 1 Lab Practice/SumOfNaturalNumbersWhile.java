import java.util.Scanner;
public class SumOfNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Not a natural number");
        } else {
            int sumFormula = number * (number + 1) / 2;
            int sumLoop = 0;
            int i = 1;
            while(i <= number) {
                sumLoop += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Results match: " + (sumFormula == sumLoop));
        }
        sc.close();
    }
}
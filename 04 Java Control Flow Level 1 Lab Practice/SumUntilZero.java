import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value = 0.0;
        do {
            value = sc.nextDouble();
            if (value != 0)
                total += value;
        } while (value != 0);
        System.out.println("Total is " + total);
        sc.close();
    }
}
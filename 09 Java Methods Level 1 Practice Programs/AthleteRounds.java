
import java.util.Scanner;
public class AthleteRounds {
    public static int calculateRounds(double side1, double side2, double side3, double totalDistanceKm) {
        double perimeter = side1 + side2 + side3;
        double totalDistanceMeters = totalDistanceKm * 1000;
        return (int) Math.ceil(totalDistanceMeters / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        int rounds = calculateRounds(side1, side2, side3, 5);
        System.out.println("Number of rounds to complete 5 km run: " + rounds);
        sc.close();
    }
}

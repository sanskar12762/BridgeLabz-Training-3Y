// Write a program to find the distance in yards and miles for the distance provided by the user in feet.
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        input.close();
    }
}


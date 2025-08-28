import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = input.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * 6.4516; // 1 square inch = 6.4516 square centimeters

        System.out.println("The area of the triangle is " + areaInches 
            + " square inches and " + areaCm + " square centimeters");

        input.close();
    }
}

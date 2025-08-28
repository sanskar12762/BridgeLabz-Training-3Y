// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters.
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseCm = input.nextDouble();
        double heightCm = input.nextDouble();
        double areaSqIn = 0.5 * (baseCm / 2.54) * (heightCm / 2.54);
        double areaSqCm = 0.5 * baseCm * heightCm;
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        input.close();
    }
}

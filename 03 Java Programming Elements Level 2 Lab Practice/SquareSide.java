// Write a program to find the side of the square whose perimeter you read from the user.
import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        input.close();
    }
}

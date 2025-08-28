/ Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
import java.util.Scanner;
public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age1 = input.nextInt();
        int age2 = input.nextInt();
        int age3 = input.nextInt();
        int height1 = input.nextInt();
        int height2 = input.nextInt();
        int height3 = input.nextInt();
        int youngestAge = age1;
        if(age2 < youngestAge) youngestAge = age2;
        if(age3 < youngestAge) youngestAge = age3;
        int tallestHeight = height1;
        if(height2 > tallestHeight) tallestHeight = height2;
        if(height3 > tallestHeight) tallestHeight = height3;
        System.out.println("Youngest age is " + youngestAge);
        System.out.println("Tallest height is " + tallestHeight);
        input.close();
    }
}


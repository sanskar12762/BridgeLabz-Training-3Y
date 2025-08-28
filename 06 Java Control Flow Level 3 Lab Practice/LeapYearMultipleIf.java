import java.util.Scanner;
public class LeapYearMultipleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year < 1582) {
            System.out.println("Leap year check only works for year >= 1582 (Gregorian calendar)");
        } else {
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        System.out.println(year + " is a Leap Year");
                    } else {
                        System.out.println(year + " is not a Leap Year");
                    }
                } else {
                    System.out.println(year + " is a Leap Year");
                }
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
        input.close();
    }
}
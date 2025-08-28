// Create a program to find the bonuses of employees based on their years of service.
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        double bonus = 0;
        if(yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("Bonus amount is " + bonus);
        input.close();
    }
}

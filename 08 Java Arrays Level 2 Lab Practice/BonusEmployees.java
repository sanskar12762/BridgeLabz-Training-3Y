
import java.util.Scanner;
public class BonusEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        int i = 0;
        while (i < 10) {
            System.out.println("Enter salary and years of service for employee " + (i + 1));
            double sal = sc.nextDouble();
            double yrs = sc.nextDouble();
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input, please enter again.");
                continue;
            }
            salary[i] = sal;
            yearsService[i] = yrs;
            i++;
        }
        for (i = 0; i < 10; i++) {
            if (yearsService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
        sc.close();
    }
}

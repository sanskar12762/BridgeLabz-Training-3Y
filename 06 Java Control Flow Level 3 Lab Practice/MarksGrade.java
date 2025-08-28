import java.util.Scanner;
public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();
        double avg = (physics + chemistry + maths) / 3;
        String grade;
        String remarks;
        if(avg >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if(avg >= 75) {
            grade = "A";
            remarks = "Good";
        } else if(avg >= 50) {
            grade = "B";
            remarks = "Average";
        } else {
            grade = "C";
            remarks = "Poor";
        }
        System.out.printf("Average: %.2f, Grade: %s, Remarks: %s
", avg, grade, remarks);
        sc.close();
    }
}

import java.util.Scanner;
public class StudentMarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] maths = new double[students];
        double[] percentage = new double[students];
        String[] grade = new String[students];
        for(int i=0; i<students; i++) {
            System.out.println("Enter marks for student " + (i+1));
            double p, c, m;
            while(true) {
                p = sc.nextDouble();
                c = sc.nextDouble();
                m = sc.nextDouble();
                if(p >= 0 && c >= 0 && m >= 0) break;
                System.out.println("Invalid marks, enter again.");
            }
            physics[i] = p; chemistry[i] = c; maths[i] = m;
            percentage[i] = (p + c + m) / 3.0;
            if(percentage[i] >= 90) grade[i] = "A+";
            else if(percentage[i] >= 75) grade[i] = "A";
            else if(percentage[i] >= 50) grade[i] = "B";
            else grade[i] = "C";
        }
        for(int i=0; i<students; i++) {
            System.out.printf("Student %d - Percentage: %.2f%%, Grade: %s
", i+1, percentage[i], grade[i]);
        }
        sc.close();
    }
}


import java.util.Scanner;
public class StudentMarksGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        double[][] marks = new double[students][3];
        double[] percentage = new double[students];
        String[] grade = new String[students];
        for(int i=0; i<students; i++) {
            System.out.println("Enter marks for student " + (i+1));
            for(int j=0; j<3; j++) {
                double mark;
                while(true) {
                    mark = sc.nextDouble();
                    if(mark >= 0) break;
                    System.out.println("Invalid mark, enter again.");
                }
                marks[i][j] = mark;
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
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
